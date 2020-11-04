package com.stictch.service.impl;

import com.stictch.dao.AdminCheckingDao;
import com.stictch.entity.AdminChecking;
import com.stictch.service.AdminCheckingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 管理员检查(AdminChecking)表服务实现类
 *
 * @author demo
 * @title AdminCheckingServiceImpl
 * @description
 * @date 2020/10/23/9:48
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AdminCheckingServiceImpl implements AdminCheckingService {
    AdminCheckingDao dao;

    @Autowired
    public void setDao(AdminCheckingDao dao) {
        this.dao = dao;
    }

    @Override
    public AdminChecking queryById(Long adminCheckId) {
        if (adminCheckId != null) {
            return dao.queryById(adminCheckId);
        } else {
            return null;
        }

    }

    @Override
    public Integer insert(AdminChecking adminChecking) {
        if (adminChecking.getAdminCheckOperate() != null) {
            return dao.insert(adminChecking);
        } else {
            return null;
        }

    }

    @Override
    public Integer update(AdminChecking adminChecking) {
        if (adminChecking.getAdminCheckOperate() != null){
            return dao.update(adminChecking);
        }else {
            return null;
        }

    }

    @Override
    public Integer deleteById(Long adminCheckId) {
        if (adminCheckId != null){
            return dao.deleteById(adminCheckId);
        }
        else {
            return 0;
        }
    }
}
