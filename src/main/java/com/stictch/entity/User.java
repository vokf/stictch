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
public class User {

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
     * phoneNumber
     */
    private String phone;
    /**
     * age
     */
    private Integer age;
    /**
     * email
     */
    private String email;
    /**
     * address
     *
     */
    private String address;
    /**
     * role
     */
    private String role;

}
