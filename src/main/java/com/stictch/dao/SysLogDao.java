package com.stictch.dao;

import com.stictch.entity.SysLog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author demo
 * @title SysLogDao
 * @description
 * @date 2020/10/23/10:26
 */
@Mapper
@Repository
public interface SysLogDao {
    /**
     * 通过ID查询单条数据
     *
     * @param sysLogId 主键
     * @return 实例对象
     */
    SysLog queryById(Long sysLogId);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param sysLog 实例对象
     * @return 对象列表
     */
    List<SysLog> queryAll(SysLog sysLog);

    /**
     * 新增数据
     *
     * @param sysLog 实例对象
     * @return 影响行数
     */
    int insert(SysLog sysLog);


    /**
     * 通过主键删除数据
     *
     * @param sysLogId 主键
     * @return 影响行数
     */
    int deleteById(Long sysLogId);

    List<SysLog> queryAll();
}
