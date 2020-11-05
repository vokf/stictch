package com.stictch.service.impl;


import com.stictch.dao.UserRoleDao;
import com.stictch.entity.UserRole;
import com.stictch.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author demo
 * @title RoleServiceImpl
 * @description
 * @date 2020/11/05/9:08
 */

public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    UserRoleDao dao;

    @Override
    public UserRole findRoleByUserId(Integer userId) {
        return dao.findRoleByUserId(userId);
    }
}
