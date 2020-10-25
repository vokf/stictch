package com.stictch.controller;

import com.stictch.entity.UserPosition;
import com.stictch.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author demo
 * @title UserPositionController
 * @description
 * @date 2020/10/25/9:24
 */
@RestController
@CrossOrigin
@RequestMapping("position")
public class UserPositionController {


    PositionService service;

    @Autowired
    public void setService(PositionService service) {
        this.service = service;
    }
    @RequestMapping("allPosition")
    public List<UserPosition> findAll(){
        return service.queryAll();
    }

}
