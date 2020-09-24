package com.stictch.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author demo
 * @title User
 * @description
 * @date 2020/08/22/21:02
 */
@Setter
@Getter
@ToString
public class User implements Serializable {

    /**
     * 普通用户id
     */
    private Integer userId;
    /**
     * 普通用户昵称
     */
    private String userName;
    /**
     * 普通用户密码
     */
    private String passWord;
    /**
     * 普通用户年龄
     */
    private Integer age;
    /**
     * 普通用户性别
     */
    private String gender;
    /**
     * 普通用户电话号码
     */
    private String phone;
    /**
     * 公司名称
     */
    private String companyName;
    /**
     * 公司地址
     */
    private String companyLocation;
    /**
     * 普通用户邮箱
     */
    private String email;
    /**
     * 普通用户的特长
     */
    private String special;

}
