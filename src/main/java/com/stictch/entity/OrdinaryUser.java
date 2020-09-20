package com.stictch.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author demo
 * @title User
 * @description
 * @date 2020/08/22/21:02
 */
@Setter
@Getter
@ToString
public class OrdinaryUser {

    /**
     * userId
     */
    private Integer userId;
    /**
     * userName
     */
    private String  userName;
    /**
     * password
     */
    private String passWord;
    /**
     * age
     */
    private Integer age;
    /**
     * 性别
     */
    private String gender;


    /**
     * phoneNumber
     */
    private String phone;

    /**
     * email
     */
    private String email;


    /**
     * role
     */
    private String special;

}
