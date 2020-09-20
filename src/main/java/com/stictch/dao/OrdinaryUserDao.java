package com.stictch.dao;

import com.stictch.entity.OrdinaryUser;
import org.apache.ibatis.annotations.Mapper;
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
public interface OrdinaryUserDao {

    /**
     * 查询所有
     * @return all
     */
    List<OrdinaryUser> findAll();

    /**
     * 登录
     * @param ordinaryUser user
     * @return User
     */
    OrdinaryUser userLogin(OrdinaryUser ordinaryUser);

    /**
     * 注册
     * @param ordinaryUser user
     * @return int
     */
    int userRegister(OrdinaryUser ordinaryUser);


}
