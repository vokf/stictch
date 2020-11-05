package com.stictch.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author demo
 * @title UserRole
 * @description
 * @date 2020/09/26/21:55
 */
@Getter
@Setter
@ToString
public class UserRole {
    private Integer id;
    private Integer userId;
    private Integer roleId;
    private List<User> userList;
    private Role roleName;
}
