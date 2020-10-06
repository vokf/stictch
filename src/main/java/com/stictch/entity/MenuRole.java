package com.stictch.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author demo
 * @title MenuRole
 * @description
 * @date 2020/09/26/21:45
 */
@ToString
@Setter
@Getter
public class MenuRole {
    private Integer id;
    private Integer menuId;
    private Integer roleId;

}
