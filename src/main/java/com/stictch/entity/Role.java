package com.stictch.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @author demo
 * @title CompanyUser
 * @description
 * @date 2020/09/20/15:27
 */
@Setter
@Getter
@ToString
public class Role implements Serializable {
    /**
     * roleId
     */
    private Integer roleId;
    /**
     * 角色名称
     */
    private String roleName;

    private List<Menu> powerList;
}
