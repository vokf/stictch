package com.stictch.dao;

import com.stictch.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author demo
 * @title CompanyUserDao
 * @description
 * @date 2020/09/20/15:32
 */
@Mapper
@Repository
public interface UserRoleDao {
    /**
     *
     * @param userId
     * @param roleIds
     * @return
     */
    Integer addRole(@Param("userId") Integer userId, @Param("roleIds") Integer[] roleIds);

    UserRole findRoleByUserId(Integer UserId);
}
