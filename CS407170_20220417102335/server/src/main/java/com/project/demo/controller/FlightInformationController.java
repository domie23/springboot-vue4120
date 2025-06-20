package com.project.demo.controller;

import com.project.demo.entity.FlightInformation;
import com.project.demo.service.FlightInformationService;
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
 *航班信息：(FlightInformation)表控制层
 *
 */
@RestController
@RequestMapping("/flight_information")
public class FlightInformationController extends BaseController<FlightInformation,FlightInformationService> {

    /**
     *航班信息对象
     */
    @Autowired
    public FlightInformationController(FlightInformationService service) {
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
