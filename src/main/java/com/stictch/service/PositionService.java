package com.stictch.service;


import com.stictch.entity.UserPosition;

import java.util.List;

/**
 * @author demo
 * @title PositionService
 * @description
 * @date 2020/10/23/11:00
 */

public interface PositionService {

    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    List<UserPosition> queryAll();

    /**
     * 通过ID查询单条数据
     *
     * @param positionId 主键
     * @return 实例对象
     */
    UserPosition queryById(Long positionId);



    /**
     * 新增数据
     *
     * @param userPosition 实例对象
     * @return 实例对象
     */
    Integer insert(UserPosition userPosition);

    /**
     * 修改数据
     *
     * @param userPosition 实例对象
     * @return 实例对象
     */
    Integer update(UserPosition userPosition);

    /**
     * 通过主键删除数据
     *
     * @param positionId 主键
     * @return 是否成功
     */
    Integer deleteById(Long positionId);
}
