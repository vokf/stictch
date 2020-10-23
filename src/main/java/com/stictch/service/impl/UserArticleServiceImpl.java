package com.stictch.service.impl;

import com.stictch.entity.UserArticle;
import com.stictch.service.UserArticleService;

import java.util.List;

/**
 * @author demo
 * @title UserArticleServiceImpl
 * @description
 * @date 2020/10/23/10:49
 */

public class UserArticleServiceImpl implements UserArticleService {
    @Override
    public UserArticle queryById(Long articleId) {
        return null;
    }

    @Override
    public List<UserArticle> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    public UserArticle insert(UserArticle userArticle) {
        return null;
    }

    @Override
    public UserArticle update(UserArticle userArticle) {
        return null;
    }

    @Override
    public boolean deleteById(Long articleId) {
        return false;
    }
}
