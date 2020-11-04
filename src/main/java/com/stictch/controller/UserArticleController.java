package com.stictch.controller;

import com.stictch.entity.RespBean;
import com.stictch.entity.UserAddArticle;
import com.stictch.service.UserAddArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author demo
 * @title UserArticleController
 * @description
 * @date 2020/10/29/15:19
 */
@CrossOrigin
@RestController
@RequestMapping("article")
public class UserArticleController {
    UserAddArticleService service;

    @Autowired
    public void setService(UserAddArticleService service) {
        this.service = service;
    }

    @PostMapping("/addArticle")
    public RespBean addArticle(@RequestBody UserAddArticle addArticle) {
        UserAddArticle insert = service.insert(addArticle);
        if (insert != null) {
            return RespBean.ok("添加成功");
        } else {
            return RespBean.error("添加失败");
        }
    }

    @GetMapping("/allArticle")
    public List<UserAddArticle> findAll() {
        return service.queryAll();
    }
    @GetMapping("")
    public List<UserAddArticle> queryAll(@RequestBody UserAddArticle addArticle){
        return service.queryAll(addArticle);
    }
}
