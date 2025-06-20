package com.project.demo.controller;

import com.project.demo.entity.ReschedulingPayment;
import com.project.demo.service.ReschedulingPaymentService;
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
 *改签付款：(ReschedulingPayment)表控制层
 *
 */
@RestController
@RequestMapping("/rescheduling_payment")
public class ReschedulingPaymentController extends BaseController<ReschedulingPayment,ReschedulingPaymentService> {

    /**
     *改签付款对象
     */
    @Autowired
    public ReschedulingPaymentController(ReschedulingPaymentService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
