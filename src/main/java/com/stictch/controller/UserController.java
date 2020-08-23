package com.stictch.controller;

import com.stictch.entity.User;
import com.stictch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author demo
 * @title UserController
 * @description
 * @date 2020/08/22/20:42
 */
@RestController
@RequestMapping("user")
public class UserController {


    private UserService service;

    @Autowired
    public void setService(UserService service) {
        this.service = service;
    }

    @RequestMapping("all")
    public List<User> all() {
        return service.findAll();
    }

}
