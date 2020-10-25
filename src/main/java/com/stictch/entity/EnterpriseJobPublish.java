package com.stictch.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author demo
 * @title EnterpriseJobPublish
 * @description
 * @date 2020/10/23/9:34
 */
@Getter
@Setter
@ToString
public class EnterpriseJobPublish implements Serializable {
    private static final long serialVersionUID = -18369463125904308L;
    /**
     * id
     */
    private Long publishId;
    /**
     * 标题
     */
    private String publishTitle;
    /**
     * 发布通知的用户
     */
    private String publishUser;
    /**
     * 发布时间
     */
    private String publishTime;
    /**
     * 基础要求
     */
    private String publishRequiredBasic;
    /**
     * 专业要求
     */
    private String publishRequiredSpecial;

    /**
     * 职责
     */
    private String publishDuty;
    private String salary;
    /**
     * 联系方式
     */
    private String publishPhone;
    /**
     * 公司地址
     */
    private String publishAddress;

    private String category;
}
