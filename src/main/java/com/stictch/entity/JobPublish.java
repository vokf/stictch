package com.stictch.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author demo
 * @title JobPublish
 * @description
 * @date 2020/10/10/16:46
 */

@Setter
@Getter
@ToString
@TableName(value = "job_publish")
public class JobPublish {
    @TableId(value = "publish_id", type = IdType.AUTO)
    private Integer publishId;
    private String user;
    private String time;
    private String basic;
    private String specialRequired;
    private String phone;
}
