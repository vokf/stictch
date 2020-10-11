package com.stictch.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author demo
 * @title Position
 * @description
 * @date 2020/10/10/16:48
 */
@ToString
@Getter
@Setter
@TableName(value = "position")
public class Position {
    @TableId(value = "",type = IdType.AUTO)
    private Integer positionId;
    private String positionName;
    private String positionIntroduce;
}
