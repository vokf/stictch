package com.stictch.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author demo
 * @title AdminChecking
 * @description
 * @date 2020/10/23/9:09
 */
@Getter
@Setter
@ToString
public class AdminChecking implements Serializable {
    private static final long serialVersionUID = -50809953086731269L;
    /**
     * id
     */
    private Long adminCheckId;
    /**
     * 标题，概要
     */
    private String adminCheckingTitle;
    /**
     * 执行的操作
     */
    private String adminCheckOperate;
    /**
     * 发来的内容
     */
    private String adminCheckContent;
    /**
     * 用户类型
     */
    private String adminCheckUserType;
    /**
     * 传来的用户名
     */
    private String adminCheckUser;
    /**
     * 时间
     */
    private Date adminCheckTime;
    /**
     * 备注
     */
    private String adminCheckRemark;

    private Integer adminCheckSuccess;
}
