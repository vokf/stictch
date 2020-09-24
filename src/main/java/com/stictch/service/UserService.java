package com.stictch.service;

import com.stictch.entity.User;

import java.util.List;

/**
 * @author demo
 * @title UserService
 * @description
 * @date 2020/08/22/21:03
 */

public interface UserService {
    /**
     * 注册前查询该用户是否重名
     * @param userName name
     * @return user
     */
    User findByUserName(String userName);

    /**
     * 登录
     * @param user user
     * @return user
     */
    User userLogin(User user);

    /**
     * 注册
     * @param user user
     * @return int
     */
    int userRegister(User user);
}
