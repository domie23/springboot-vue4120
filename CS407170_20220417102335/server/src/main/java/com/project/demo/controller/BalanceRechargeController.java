package com.project.demo.controller;

import com.project.demo.entity.BalanceRecharge;
import com.project.demo.service.BalanceRechargeService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *余额充值：(BalanceRecharge)表控制层
 *
 */
@RestController
@RequestMapping("/balance_recharge")
public class BalanceRechargeController extends BaseController<BalanceRecharge,BalanceRechargeService> {

    /**
     *余额充值对象
     */
    @Autowired
    public BalanceRechargeController(BalanceRechargeService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        String sql = "SELECT MAX(balance_recharge_id) AS max FROM "+"balance_recharge";
        Query select = service.runCountSql(sql);
        Integer max = (Integer) select.getSingleResult();
        sql = "UPDATE `user_registration` INNER JOIN `balance_recharge` ON user_registration.account_number=balance_recharge.account_number SET user_registration.account_balance = user_registration.account_balance + balance_recharge.recharge_amount WHERE balance_recharge.balance_recharge_id="+max;
        select = service.runCountSql(sql);
        select.executeUpdate();
        return success(1);
    }

}
