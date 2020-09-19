package com.stictch.entity;

import lombok.Getter;
import lombok.Setter;


/**
 * @author demo
 * @title Result
 * @description
 * @date 2020/09/19/9:19
 */
@Setter
@Getter
public class Result {
    private Object data;
    private static int SUCCESS = 1;
    private static int FAIL = 0;
    private String message = "success";
    private int code;

    public Result(Object data) {
        this.code = SUCCESS;
        this.data = data;
    }




    public Result() {
        this.code = SUCCESS;
    }
    public static Result success( Object data) {
        Result rb = new Result(data);
        rb.setMessage("success");
        rb.setCode(SUCCESS);
        return rb;
    }


    public static Result success() {
        Result rb = new Result();
        rb.setMessage("success");
        rb.setCode(SUCCESS);
        return rb;
    }

    public static Result fail() {
        Result rb = new Result();
        rb.setMessage("fail");
        rb.setCode(FAIL);
        return rb;
    }
}
