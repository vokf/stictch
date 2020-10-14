package com.stictch.service;

import com.stictch.entity.Role;
import com.stictch.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author demo
 * @title UserService
 * @description
 * @date 2020/08/22/21:03
 */

public interface UserService {


    /**
     * 查询所有
     *
     * @return all
     */
    User findByUserName(@Param("userName") String userName);

    /**
     * @param userName
     * @param password
     * @return
     */
    User userLogin(String userName, String password);

    /**
     * 注册
     *
     * @param user user
     * @return int
     */
    Integer userRegister(User user);

    /**
     * @param id
     * @return
     */
    List<Role> getUserRolesById(Integer id);

    /**
     * @param userName
     * @return
     */
    User loadUserByUserName(String userName);

    /**
     * @param userId
     * @param keywords
     * @return
     */
    List<User> getAllUsers(@Param("userId") Integer userId, @Param("keywords") String keywords);

    /**
     * 通过用户名查询该用户的所有信息
     * @param userId
     * @return
     */
    List<User> findUserById(@Param("userId" ) Integer userId);
    /**
     * 用户企业认证
     * @param user
     * @return 认证成功
     */
    User companyUseraddLicense(User user);

    /**
     * 修改完善用户信息
     * @param user user
     * @return int
     */
    Integer updateUser(User user);

    /**
     * 删除
     * @param id id
     * @return int
     */
    Integer deleteUserById(int id);
}
