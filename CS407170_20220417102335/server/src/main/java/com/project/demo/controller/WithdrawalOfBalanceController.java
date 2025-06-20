package com.project.demo.controller;

import com.project.demo.entity.WithdrawalOfBalance;
import com.project.demo.service.WithdrawalOfBalanceService;
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
 *余额提现：(WithdrawalOfBalance)表控制层
 *
 */
@RestController
@RequestMapping("/withdrawal_of_balance")
public class WithdrawalOfBalanceController extends BaseController<WithdrawalOfBalance,WithdrawalOfBalanceService> {

    /**
     *余额提现对象
     */
    @Autowired
    public WithdrawalOfBalanceController(WithdrawalOfBalanceService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        String sql = "SELECT MAX(withdrawal_of_balance_id) AS max FROM "+"withdrawal_of_balance";
        Query select = service.runCountSql(sql);
        Integer max = (Integer) select.getSingleResult();
        sql = "UPDATE `user_registration` INNER JOIN `withdrawal_of_balance` ON user_registration.account_number=withdrawal_of_balance.account_number SET user_registration.account_balance = user_registration.account_balance - withdrawal_of_balance.withdrawal_amount WHERE withdrawal_of_balance.withdrawal_of_balance_id="+max;
        select = service.runCountSql(sql);
        select.executeUpdate();
        return success(1);
    }

}
