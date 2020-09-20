package com.stictch.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author demo
 * @title CompanyUser
 * @description
 * @date 2020/09/20/15:27
 */
@Setter
@Getter
@ToString
public class CompanyUser {
    /**
     * 用户Id
     */
    private Integer userId;
    /**
     * 用户昵称
     */
    private String userName;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 公司全称
     */
    private String companyName;
    /**
     * 公司联系电话
     */
    private String phone;
    /**
     * 公司工作邮箱
     */
    private String companyEmail;
    /**
     * 公司地址
     */
    private String companyLocation;
}
