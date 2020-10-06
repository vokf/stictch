package com.stictch.dao;

import com.stictch.entity.Role;
import com.stictch.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author demo
 * @title UserDao
 * @description
 * @date 2020/08/22/21:03
 */
@Mapper
@Repository
public interface UserDao {

    /**
     * 查询所有
     *
     * @return all
     */
    User findByUserName(@Param("userName") String userName);

    /**
     * 登录
     *
     * @param user user
     * @return User
     */
    User userLogin(User user);

    /**
     * 注册
     *
     * @param user user
     * @return int
     */
    int userRegister(User user);

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

}
