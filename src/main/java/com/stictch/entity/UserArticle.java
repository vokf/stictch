package com.stictch.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author demo
 * @title UserArticle
 * @description
 * @date 2020/10/23/10:40
 */
@Getter
@Setter
@ToString
public class UserArticle implements Serializable {
    private static final long serialVersionUID = 784613141079577776L;
    /**
     * 题目Id
     */
    private Long articleId;
    /**
     * 文章大标题
     */
    private String articleBigTitle;
    /**
     * 文章小标题
     */
    private String articleSmallTitle;
    /**
     * 内容
     */
    private String articleContent;
    /**
     * 对应的图片
     */
    private String articleImage;
    /**
     * 对应的视频
     */
    private String articleVideo;
    /**
     * 上传用户Id
     */
    private String  userName;
    /**
     * 分类
     */
    private String articleCategory;
    /**
     * userId
     */
    private Integer userId;
}
