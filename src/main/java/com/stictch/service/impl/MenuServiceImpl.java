package com.stictch.service.impl;

import com.stictch.dao.MenuDao;

import com.stictch.entity.Menu;
import com.stictch.entity.User;
import com.stictch.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @author demo
 * @title MenuServiceImpl
 * @description
 * @date 2020/09/27/14:13
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class MenuServiceImpl implements MenuService {
    private MenuDao dao;

    @Autowired
    public void setDao(MenuDao dao) {
        this.dao = dao;
    }


    @Override
    public List<Menu> getAllMenus() {
        return dao.getAllMenus();
    }

    @Override
    public List<Menu> getMenuByUserId(Integer id) {
        return dao.getMenuByUserId(((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUserId());

    }

    @Override
    public List<Menu> getAllMenusWithRole() {
        return dao.getAllMenusWithRole();
    }

    @Override
    public List<Integer> getMenusByRoleId(Integer rid) {
        return dao.getMenusByRoleId(rid);
    }
}
