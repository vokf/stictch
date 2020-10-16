package com.stictch.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.JdbcType;

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
    @TableField(value = "article_big_title", jdbcType = JdbcType.VARCHAR)
    private String bigTitle;
    @TableField(value = "article_small_title", jdbcType = JdbcType.VARCHAR)
    private String smallTitle;
    @TableField(value = "article_content", jdbcType = JdbcType.VARCHAR)
    private String content;
    @TableField(value = "article_image", jdbcType = JdbcType.VARCHAR)
    private String image;
    @TableField(value = "article_video", jdbcType = JdbcType.VARCHAR)
    private String video;
    @TableField(value = "article_upload_user_id", jdbcType = JdbcType.INTEGER)
    private Integer uploadUserId;


}
