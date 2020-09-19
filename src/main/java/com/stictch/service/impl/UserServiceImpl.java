package com.stictch.service.impl;

import com.stictch.dao.UserDao;
import com.stictch.entity.User;
import com.stictch.service.UserService;

import lombok.extern.log4j.Log4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * @author demo
 * @title UserServiceImpl
 * @description
 * @date 2020/08/22/21:03
 */
@Service
@Log4j
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    private UserDao dao;

    @Autowired
    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public List<User> findAll() {
        return dao.findAll();
    }

    @Override
    public User userLogin(User user) {
        if (user.getUserName() == null || user.getPassWord() == null) {
            log.error("用户名或者密码为空");
            return null;
        } else {
            return dao.userLogin(user);
        }

    }

    @Override
    public int userRegister(User user) {

        if (user.getUserName() == null || user.getPassWord() == null || user.getPhone() == null || user.getEmail() == null) {

            log.error("用户名或者密码或者电话号码，或者邮箱为空");
            return 0;
        } else {
            return dao.userRegister(user);
        }

    }
}
