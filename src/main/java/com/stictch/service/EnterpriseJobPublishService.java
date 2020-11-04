package com.stictch.service;


import com.stictch.entity.EnterpriseJobPublish;

import java.util.List;

/**
 * @author demo
 * @title EnterpriseJobPublishService
 * @description
 * @date 2020/10/23/9:50
 */

public interface EnterpriseJobPublishService {

    /**
     * 通过ID查询单条数据
     *
     * @param publishId 主键
     * @return 实例对象
     */
    EnterpriseJobPublish queryById(Long publishId);


    /**
     * 新增数据
     *
     * @param enterpriseJobPublish 实例对象
     * @return 实例对象
     */
    Integer insert(EnterpriseJobPublish enterpriseJobPublish);

    /**
     * 修改数据
     *
     * @param enterpriseJobPublish 实例对象
     * @return 实例对象
     */
    Integer update(EnterpriseJobPublish enterpriseJobPublish);

    /**
     * 通过主键删除数据
     *
     * @param publishId 主键
     * @return 是否成功
     */
    Integer deleteById(Long publishId);

    List<EnterpriseJobPublish> queryAll(EnterpriseJobPublish enterpriseJobPublish);

    List<EnterpriseJobPublish> queryAll();
    Integer getCount();
}
