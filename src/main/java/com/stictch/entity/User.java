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

    private Integer userId;
    /**
     *
     */
    private String  userName;
    private String passWord;
    private String phone;
    private Integer age;
    private String email;
    private String address;
    private String role;

}
