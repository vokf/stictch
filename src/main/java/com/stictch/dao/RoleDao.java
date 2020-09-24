package com.stictch.dao;

import com.stictch.entity.Power;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author demo
 * @title RoleDao
 * @description
 * @date 2020/09/22/10:43
 */

@Mapper
public interface RoleDao {

    List<Power> findPower();
}
