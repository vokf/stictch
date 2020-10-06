package com.stictch.service.impl;

import com.stictch.dao.UserDao;
import com.stictch.dao.UserRoleDao;
import com.stictch.entity.Role;
import com.stictch.entity.User;
import com.stictch.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
@Slf4j
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    BCryptPasswordEncoder encoder;

    private UserRoleDao role;

    private UserDao dao;

    @Autowired
    public void setRole(UserRoleDao role) {
        this.role = role;
    }


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
    public User userLogin(String userName, String password) {

        if (userName == null || password == null) {
            log.error("用户名或者密码为空");
            return null;
        } else {
            User user = dao.findByUserName(userName);
            if (user != null && encoder.matches(password, user.getPassword())) {
                return user;
            } else {
                return null;
            }
        }

    }

    @Override
    public int userRegister(User user) {

        if (user.getUsername() == null || user.getPassword() == null || user.getPhone() == null || user.getEmail() == null) {

            log.error("用户名或者密码或者电话号码，或者邮箱为空");
            return 0;
        } else {
            String encode = encoder.encode(user.getPassword());
            user.setPassWord(encode);
            return dao.userRegister(user);

        }

    }

    @Override
    public List<Role> getUserRolesById(Integer id) {
        return dao.getUserRolesById(id);
    }

    @Override
    public User loadUserByUserName(String userName) {
        return dao.loadUserByUserName(userName);
    }

    @Override
    public List<User> getAllUsers(Integer userId, String keywords) {

        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        log.info("表单登录用户名:" + s);
        User user = dao.loadUserByUserName(s);
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在!");
        }

        user.setRoles(dao.getUserRolesById(user.getUserId()));
        return user;

    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }


    @Override
    public List<User> findUserById(Integer userId) {
        if (userId == 0) {
            return null;
        } else {
           return dao.findUserById(userId);
        }
    }
}
