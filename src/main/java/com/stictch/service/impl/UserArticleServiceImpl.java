package com.stictch.service.impl;

import com.stictch.dao.UserArticleDao;
import com.stictch.entity.UserArticle;
import com.stictch.service.UserArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author demo
 * @title UserArticleServiceImpl
 * @description
 * @date 2020/10/23/10:49
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserArticleServiceImpl implements UserArticleService {

    UserArticleDao dao;

    @Autowired
    public void setDao(UserArticleDao dao) {
        this.dao = dao;
    }

    @Override
    public UserArticle queryById(Long articleId) {
        return null;
    }

    @Override
    public List<UserArticle> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    public Integer insert(UserArticle userArticle) {
        return dao.insert(userArticle);
    }

    @Override
    public Integer update(UserArticle userArticle) {
        return null;
    }

    @Override
    public Integer deleteById(Long articleId) {
        return 0;
    }


    @Override
    public List<UserArticle> allArticle() {
        return dao.queryAll();
    }

    @Override
    public List<UserArticle> allArticle(UserArticle article) {
        return dao.queryAll(article);
    }
}
