package com.stictch.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author demo
 * @title Log
 * @description
 * @date 2020/09/22/10:19
 */
@Getter
@Setter
@ToString
public class Log implements Serializable {
    /**
     * 日志Id
     */
    private Integer id;
    /**
     * 执行操作的用户
     */
    private String userName;
    /**
     * 执行操作的时间
     */
    private String time;
    /**
     * 执行了什么操作
     */
    private String oprate;
}
