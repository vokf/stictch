package com.stictch.service;

import com.stictch.entity.Menu;

import java.util.List;

/**
 * @author demo
 * @title MenuService
 * @description
 * @date 2020/09/27/14:12
 */

public interface MenuService {
    /**
     *
     * @return
     */
    List<Menu> getAllMenus();

    /**
     *
     * @param id
     * @return
     */
    List<Menu> getMenuByUserId(Integer id);

    /**
     *
     * @return
     */
    List<Menu> getAllMenusWithRole();

    /**
     *
     * @param rid
     * @return
     */
    List<Integer> getMenusByRoleId(Integer rid);
}
