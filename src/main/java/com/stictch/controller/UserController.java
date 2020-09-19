package com.stictch.controller;

import com.alibaba.fastjson.JSON;
import com.stictch.entity.Result;
import com.stictch.entity.User;
import com.stictch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author demo
 * @title UserController
 * @description
 * @date 2020/08/22/20:42
 */
@RestController
@RequestMapping("user")
@CrossOrigin
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


    //    @RequestMapping(value = "/doI", produces = {"text/html;charset=UTF-8"}, method = {RequestMethod.POST,RequestMethod.GET})
//    public String doI(HttpServletRequest request, HttpServletResponse response) {
//        System.out.println(request.getParameter("userName"));
//        System.out.println(request.getParameter("password"));
//        System.out.println(request.getParameter("phone"));
//        return "OK";
//    }

    @RequestMapping(value = "/userLogin", method = RequestMethod.POST)
    public Result userLogin(@RequestBody String json) {
        System.out.println(json);
        User user = JSON.parseObject(json, User.class);
        User result = service.userLogin(user);
        return result != null ? Result.success() : Result.fail();
    }
}
