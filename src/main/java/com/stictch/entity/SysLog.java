package com.stictch.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @author demo
 * @title SysLog
 * @description
 * @date 2020/10/23/10:22
 */
@Getter
@Setter
public class SysLog implements Serializable {
    private static final long serialVersionUID = -70337611397921482L;
    /**
     * id
     */
    private Long sysLogId;
    /**
     * 操作用户
     */
    private String userName;
    /**
     * 操作时间
     */
    private String sysLogOperateTime;
    /**
     * 干了什么操作
     */
    private String sysUserDoWhatOperate;
    private Integer userId;

}
