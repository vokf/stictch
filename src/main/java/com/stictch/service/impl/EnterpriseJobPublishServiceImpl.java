package com.stictch.service.impl;


import com.stictch.dao.EnterpriseJobPublishDao;
import com.stictch.entity.EnterpriseJobPublish;
import com.stictch.service.EnterpriseJobPublishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author demo
 * @title EnterpriseJobPublishServiceImpl
 * @description
 * @date 2020/10/23/9:51
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class EnterpriseJobPublishServiceImpl implements EnterpriseJobPublishService {
    EnterpriseJobPublishDao dao;

    @Autowired
    public void setDao(EnterpriseJobPublishDao dao) {
        this.dao = dao;
    }

    @Override
    public EnterpriseJobPublish queryById(Long publishId) {
        return null;
    }

    @Override
    public Integer insert(EnterpriseJobPublish enterpriseJobPublish) {
        if (enterpriseJobPublish == null) {
            log.error("enterpriseJobPublish是空的");
            return null;
        } else {
            return dao.insert(enterpriseJobPublish);
        }

    }

    @Override
    public EnterpriseJobPublish update(EnterpriseJobPublish enterpriseJobPublish) {
        return null;
    }

    @Override
    public Integer deleteById(Long publishId) {
        if (publishId != null && publishId != 0){
            return dao.deleteById(publishId);
        }
        else {
            log.error("publishId是空的 ");
            return 0;
        }

    }

    @Override
    public List<EnterpriseJobPublish> queryAll(EnterpriseJobPublish enterpriseJobPublish) {
        return dao.queryAll(enterpriseJobPublish);
    }

    @Override
    public List<EnterpriseJobPublish> queryAll() {
        return dao.queryAll();
    }

    @Override
    public Integer getCount() {
        return dao.getCount();
    }
}
