package com.stictch.dao;

import com.stictch.entity.AdminChecking;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 管理员检查(AdminChecking)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-23 08:45:21
 */
public interface AdminCheckingDao {

    /**
     * 通过ID查询单条数据
     *
     * @param adminCheckId 主键
     * @return 实例对象
     */
    AdminChecking queryById(Long adminCheckId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<AdminChecking> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


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
    int insert(AdminChecking adminChecking);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<AdminChecking> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<AdminChecking> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<AdminChecking> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<AdminChecking> entities);

    /**
     * 修改数据
     *
     * @param adminChecking 实例对象
     * @return 影响行数
     */
    int update(AdminChecking adminChecking);

    /**
     * 通过主键删除数据
     *
     * @param adminCheckId 主键
     * @return 影响行数
     */
    int deleteById(Long adminCheckId);

}