package com.stictch.dao;

import com.stictch.entity.AdminChecking;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author demo
 * 管理员检查(AdminChecking)表数据库访问层
 * @title AdminCheckingDao
 * @description
 * @date 2020/10/23/9:12
 */

@Mapper
@Repository
public interface AdminCheckingDao {
    /**
     * 通过ID查询单条数据
     *
     * @param adminCheckId 主键
     * @return 实例对象
     */
    AdminChecking queryById(Long adminCheckId);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param adminChecking 实例对象
     * @return 对象列表
     */
    List<AdminChecking> queryAll(AdminChecking adminChecking);

    /**
     * 新增数据
     *
     * @param adminChecking 实例对象
     * @return 影响行数
     */
    Integer insert(AdminChecking adminChecking);

    /**
     * 修改数据
     *
     * @param adminChecking 实例对象
     * @return 影响行数
     */
    Integer update(AdminChecking adminChecking);

    /**
     * 通过主键删除数据
     *
     * @param adminCheckId 主键
     * @return 影响行数
     */
    Integer deleteById(Long adminCheckId);

    /**
     *
     * @return
     */
    List<AdminChecking> queryAll();
}
