package com.stictch.controller;

import com.stictch.entity.Menu;
import com.stictch.entity.User;
import com.stictch.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author demo
 * @title SystemConfigController
 * @description
 * @date 2020/09/27/22:11
 */
@RestController
@CrossOrigin
@RequestMapping("/system/config")
public class SystemController {
    @Autowired
    private MenuService menuService;

//    @GetMapping("/menu")
//    public List<Menu> getMenuByUserId() {
//        return menuService.getMenuByUserId(((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUserId());
//    }

    @RequestMapping("index")
    public String index(){
        return "index";
    }
}
