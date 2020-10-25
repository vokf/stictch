package com.stictch.dao;


import com.stictch.entity.UserPosition;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 职位(UserPosition)表数据库访问层
 *
 * @author demo
 * @title UserPositionDao
 * @description
 * @date 2020/10/23/10:52
 */
@Mapper
@Repository
public interface UserPositionDao {


    /**
     * 通过ID查询单条数据
     *
     * @param positionId 主键
     * @return 实例对象
     */
    UserPosition queryById(Long positionId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<UserPosition> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    List<UserPosition> queryAll();

    /**
     * 新增数据
     *
     * @param userPosition 实例对象
     * @return 影响行数
     */
    int insert(UserPosition userPosition);

    /**
     * 修改数据
     *
     * @param userPosition 实例对象
     * @return 影响行数
     */
    int update(UserPosition userPosition);

    /**
     * 通过主键删除数据
     *
     * @param positionId 主键
     * @return 影响行数
     */
    int deleteById(Long positionId);
}
