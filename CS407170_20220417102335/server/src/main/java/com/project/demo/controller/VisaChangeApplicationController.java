package com.project.demo.controller;

import com.project.demo.entity.VisaChangeApplication;
import com.project.demo.service.VisaChangeApplicationService;
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
 *改签申请：(VisaChangeApplication)表控制层
 *
 */
@RestController
@RequestMapping("/visa_change_application")
public class VisaChangeApplicationController extends BaseController<VisaChangeApplication,VisaChangeApplicationService> {

    /**
     *改签申请对象
     */
    @Autowired
    public VisaChangeApplicationController(VisaChangeApplicationService service) {
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
