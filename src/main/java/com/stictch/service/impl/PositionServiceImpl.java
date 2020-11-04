package com.stictch.service.impl;

import com.stictch.dao.UserPositionDao;
import com.stictch.entity.UserPosition;
import com.stictch.service.PositionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author demo
 * @title PositionServiceImpl
 * @description
 * @date 2020/10/23/11:00
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class PositionServiceImpl implements PositionService {

    private UserPositionDao positionDao;

    @Autowired
    public void setPositionDao(UserPositionDao positionDao) {
        this.positionDao = positionDao;
    }

    @Override
    public UserPosition queryById(Long positionId) {
        if (positionId != null) {
            return positionDao.queryById(positionId);
        } else {
            log.debug("postionId是空的");
            return null;
        }
    }

    @Override
    public Integer insert(UserPosition userPosition) {
        return positionDao.insert(userPosition);
    }

    @Override
    public Integer update(UserPosition userPosition) {
        return positionDao.update(userPosition);
    }

    @Override
    public Integer deleteById(Long positionId) {
        return positionDao.deleteById(positionId);
    }

    @Override
    public List<UserPosition> queryAll() {
        return positionDao.queryAll();
    }
}
