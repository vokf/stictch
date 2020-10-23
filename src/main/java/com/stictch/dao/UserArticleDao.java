package com.stictch.dao;

import com.stictch.entity.UserArticle;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author demo
 * @title UserArticleDao
 * @description
 * @date 2020/10/23/10:42
 */
@Mapper
@Repository
public interface UserArticleDao {
    /**
     * 通过ID查询单条数据
     *
     * @param articleId 主键
     * @return 实例对象
     */
    UserArticle queryById(Long articleId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<UserArticle> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param userArticle 实例对象
     * @return 对象列表
     */
    List<UserArticle> queryAll(UserArticle userArticle);

    /**
     * 新增数据
     *
     * @param userArticle 实例对象
     * @return 影响行数
     */
    int insert(UserArticle userArticle);


    /**
     * 修改数据
     *
     * @param userArticle 实例对象
     * @return 影响行数
     */
    int update(UserArticle userArticle);

    /**
     * 通过主键删除数据
     *
     * @param articleId 主键
     * @return 影响行数
     */
    int deleteById(Long articleId);
}
