package com.stictch.dao;

import com.stictch.entity.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author demo
 * @title RoleDao
 * @description
 * @date 2020/09/22/10:43
 */

@Mapper
@Repository
public interface MenuDao {

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
