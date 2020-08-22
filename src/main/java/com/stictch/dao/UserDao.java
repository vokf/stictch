package com.stictch.dao;

import com.stictch.entity.User;
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
public interface UserDao {

    /**
     * 查询所有
     * @return all
     */
    List<User> findAll();


}
