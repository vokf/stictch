package com.stictch.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author demo
 * @title UserPosition
 * @description
 * @date 2020/10/23/10:51
 */
@Getter
@Setter
@ToString
public class UserPosition implements Serializable {
    private static final long serialVersionUID = -53503581285757347L;
    /**
     * 职位Id
     */
    private Long positionId;
    /**
     * 职位名字
     */
    private String positionName;
    /**
     * 职位介绍
     */
    private String positionIntroduce;

}
