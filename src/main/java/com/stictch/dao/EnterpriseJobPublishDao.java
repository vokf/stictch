package com.stictch.dao;

import com.stictch.entity.EnterpriseJobPublish;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 企业用户发布求职要求(EnterpriseJobPublish)表数据库访问层
 *
 * @author demo
 * @title EnterpriseJobPublishDao
 * @description
 * @date 2020/10/23/9:36
 */
@Repository
@Mapper
public interface EnterpriseJobPublishDao {

    /**
     * 通过ID查询单条数据
     *
     * @param publishId 主键
     * @return 实例对象
     */
    EnterpriseJobPublish queryById(Long publishId);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param enterpriseJobPublish 实例对象
     * @return 对象列表
     */
    List<EnterpriseJobPublish> queryAll(EnterpriseJobPublish enterpriseJobPublish);

    /**
     * 新增数据
     *
     * @param enterpriseJobPublish 实例对象
     * @return 影响行数
     */
    Integer insert(EnterpriseJobPublish enterpriseJobPublish);

    /**
     * 修改数据
     *
     * @param enterpriseJobPublish 实例对象
     * @return 影响行数
     */
    Integer update(EnterpriseJobPublish enterpriseJobPublish);

    /**
     * 通过主键删除数据
     *
     * @param publishId 主键
     * @return 影响行数
     */
    Integer deleteById(Long publishId);

    /**
     * 查询所有
     *
     * @return
     */
    List<EnterpriseJobPublish> queryAll();

    Integer getCount();

}
