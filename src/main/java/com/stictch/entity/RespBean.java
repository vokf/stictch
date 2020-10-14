package com.stictch.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


/**
 * @author demo
 * @title Result
 * @description
 * @date 2020/09/19/9:19
 */
@Getter
@Setter
public class RespBean implements Serializable {
    private Integer status;
    private String msg;
    private Object obj;



    public static RespBean ok(String msg) {
        return new RespBean(200, msg, null);
    }

    public static RespBean ok(String msg, Object obj) {
        return new RespBean(200, msg, obj);
    }

    public static RespBean error(String msg) {
        return new RespBean(500, msg, null);
    }

    public static RespBean error(String msg, Object obj) {
        return new RespBean(500, msg, obj);
    }


    public RespBean(Integer status, String msg, Object obj) {
        this.status = status;
        this.msg = msg;
        this.obj = obj;
    }

}
