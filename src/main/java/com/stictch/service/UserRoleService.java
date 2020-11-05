package com.stictch.service;

import com.stictch.entity.Role;
import com.stictch.entity.UserRole;

/**
 * @author demo
 * @title RoleService
 * @description
 * @date 2020/11/05/9:08
 */

public interface UserRoleService {

    UserRole findRoleByUserId(Integer userId);
}
