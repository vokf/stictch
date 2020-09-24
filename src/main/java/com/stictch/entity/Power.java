package com.stictch.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author demo
 * @title Power
 * @description
 * @date 2020/09/22/9:48
 */
@ToString
@Getter
@Setter
public class Power implements Serializable {
    /**
     * 权限的Id
     */
    private Integer powerId;
    /**
     * 权限的名称
     */
    private String powerName;
    /**
     * 资源路径
     */
    private String path;
    /**
     * 权限的标题
     */
    private String powerTitle;
    /**
     * 角色Id
     */
    private Integer roleId;
    /**
     * 备注
     */
    private String remark;
}
