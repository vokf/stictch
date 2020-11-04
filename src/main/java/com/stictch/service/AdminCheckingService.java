package com.stictch.service;

import com.stictch.entity.AdminChecking;

/**
 * @author demo
 * @title AdminCheckingService
 * @description
 * @date 2020/10/23/9:42
 */

public interface AdminCheckingService {
    /**
     * 通过ID查询单条数据
     *
     * @param adminCheckId 主键
     * @return 实例对象
     */
    AdminChecking queryById(Long adminCheckId);

    /**
     * 新增数据
     *
     * @param adminChecking 实例对象
     * @return 实例对象
     */
    Integer insert(AdminChecking adminChecking);


    /**
     * 修改数据
     *
     * @param adminChecking 实例对象
     * @return 实例对象
     */
    Integer update(AdminChecking adminChecking);

    /**
     * 通过主键删除数据
     *
     * @param adminCheckId 主键
     * @return 是否成功
     */
    Integer deleteById(Long adminCheckId);

}
