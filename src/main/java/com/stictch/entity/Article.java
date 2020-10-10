package com.stictch.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author demo
 * @title Article
 * @description
 * @date 2020/10/10/11:24
 */
@TableName(value = "article")
@Getter
@Setter
@ToString
public class Article implements Serializable {
    @TableId(value = "article_id", type = IdType.AUTO)
    private Integer articleId;
    private String bigTitle;
    private String smallTitle;
    private String content;
    private String image;
    private String video;
    private Integer uploadUserId;


}
