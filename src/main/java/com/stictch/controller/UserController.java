package com.stictch.controller;

import com.alibaba.fastjson.JSON;
import com.stictch.entity.User;
import com.stictch.entity.Result;
import com.stictch.service.UserService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
@CrossOrigin
@Slf4j
public class UserController {
    private UserService service;

    @Autowired
    public void setService(UserService service) {
        this.service = service;
    }


    /**
     * 登录
     *
     * @param json json
     * @return result
     */
    @RequestMapping(value = "/userLogin", method = {RequestMethod.POST, RequestMethod.GET})
    public Result userLogin(@RequestBody String json) {
        System.out.println(json);
        User user = JSON.parseObject(json, User.class);
        User result = service.userLogin(user);

        return result != null ? Result.success() : Result.fail();
    }


    /**
     * 注册
     *
     * @param json json
     * @return result
     */
    @RequestMapping(value = "register", method = RequestMethod.POST)
    public Result userRegister(@RequestBody String json) {
        User user = JSON.parseObject(json, User.class);
        service.userRegister(user);
        return Result.success();
    }

    /**
     * 查询注册用户是否有重名的
     *
     * @param userName name
     * @return string
     */
    @RequestMapping(value = "/findUserByName", method = {RequestMethod.GET})
    public String findByName(String userName) {

        User byUserName = service.findByUserName(userName);
        if (byUserName == null) {
            return "true";
        } else {
            return "false";
        }

    }
}
