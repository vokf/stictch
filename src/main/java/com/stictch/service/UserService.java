package com.stictch.service;

import com.stictch.entity.OrdinaryUser;

import java.util.List;

/**
 * @author demo
 * @title UserService
 * @description
 * @date 2020/08/22/21:03
 */

public interface UserService {
    /**
     *  查询所有
     * @return all
     */
    List<OrdinaryUser> findAll();

    /**
     * 登录
     * @param ordinaryUser user
     * @return user
     */
    OrdinaryUser userLogin(OrdinaryUser ordinaryUser);

    /**
     * 注册
     * @param ordinaryUser user
     * @return int
     */
    int userRegister(OrdinaryUser ordinaryUser);
}
