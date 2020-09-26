package com.stictch.service.impl;

import com.stictch.dao.UserDao;
import com.stictch.entity.User;
import com.stictch.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author demo
 * @title UserServiceImpl
 * @description
 * @date 2020/08/22/21:03
 */
@Service
@Slf4j
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService, UserDetailsService {


    private UserDao dao;

    @Autowired
    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public User findByUserName(String userName) {
        if (userName == null || "".equals(userName)) {
            log.error("没有输入用户名");
        }

        return dao.findByUserName(userName);
    }

    @Override
    public User userLogin(User user) {
        if (user.getUsername() == null || user.getPassword() == null) {
            log.error("用户名或者密码为空");
            return null;
        } else {
            return dao.userLogin(user);
        }

    }

    @Override
    public int userRegister(User user) {

        if (user.getUsername() == null ||user.getPassword() == null || user.getPhone() == null || user.getEmail() == null) {

            log.error("用户名或者密码或者电话号码，或者邮箱为空");
            return 0;
        } else {
            return dao.userRegister(user);
        }

    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        return null;

    }
}
