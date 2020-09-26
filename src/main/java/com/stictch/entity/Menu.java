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
public class Menu implements Serializable {
    /**
     * 权限的Id
     */
    private Integer menuId;
    /**
     * url
     */
    private String url;
    /**
     * path
     */
    private String path;
    /**
     * component
     */
    private String component;
    /**
     * name
     */
    private String name;
    /**
     * parentId
     */
    private Integer parentId;

    /**
     * 备注
     */
    private String remark;
}
