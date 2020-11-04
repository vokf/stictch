package com.stictch.service;


import com.stictch.entity.UserArticle;

import java.util.List;

/**
 * @author demo
 * @title UserArticleServicee
 * @description
 * @date 2020/10/23/10:46
 */

public interface UserArticleService {
    /**
     * 通过ID查询单条数据
     *
     * @param articleId 主键
     * @return 实例对象
     */
    UserArticle queryById(Long articleId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<UserArticle> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param userArticle 实例对象
     * @return 实例对象
     */
    Integer insert(UserArticle userArticle);

    /**
     * 修改数据
     *
     * @param userArticle 实例对象
     * @return 实例对象
     */
    Integer update(UserArticle userArticle);

    /**
     * 通过主键删除数据
     *
     * @param articleId 主键
     * @return 是否成功
     */
    Integer deleteById(Long articleId);

    List<UserArticle> allArticle();

    List<UserArticle> allArticle(UserArticle article);
}
