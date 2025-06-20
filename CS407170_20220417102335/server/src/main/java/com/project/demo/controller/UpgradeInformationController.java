package com.project.demo.controller;

import com.project.demo.entity.UpgradeInformation;
import com.project.demo.service.UpgradeInformationService;
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
 *机票升舱：(UpgradeInformation)表控制层
 *
 */
@RestController
@RequestMapping("/upgrade_information")
public class UpgradeInformationController extends BaseController<UpgradeInformation,UpgradeInformationService> {

    /**
     *机票升舱对象
     */
    @Autowired
    public UpgradeInformationController(UpgradeInformationService service) {
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
