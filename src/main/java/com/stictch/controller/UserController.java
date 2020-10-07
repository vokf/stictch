package com.stictch.controller;

import com.alibaba.fastjson.JSON;
import com.stictch.config.VerificationCode;
import com.stictch.entity.RespBean;
import com.stictch.entity.User;
import com.stictch.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;

/**
 * @author demo
 * @title UserController
 * @description
 * @date 2020/08/22/20:42
 */
@RestController
@RequestMapping(value = "user")
@CrossOrigin
@Slf4j
public class UserController {
    private UserService service;

    @Autowired
    public void setService(UserService service) {
        this.service = service;
    }


    /**
     * @param
     * @return
     */
    @RequestMapping(value = "/userLogin", produces = "application/json", method = RequestMethod.POST)
    public RespBean userLogin(@RequestBody User user) {
        System.out.println("passssss" + user);


        User result = service.userLogin(user.getUsername(), user.getPassword());


        return result != null ? RespBean.ok("登录成功", (result.getUserId())) : RespBean.error("登陆失败");

    }


    /**
     * 注册
     *
     * @param json json
     * @return result
     */
    @RequestMapping(value = "register", method = RequestMethod.POST, produces = "application/json")
    public RespBean userRegister(@RequestBody String json) {
        User user = JSON.parseObject(json, User.class);
        service.userRegister(user);
        return RespBean.ok("注册成功");
    }

    /**
     * 查询注册用户是否有重名的
     *
     * @param userName name
     * @return string
     */
    @RequestMapping(value = "/findUserByName", method = {RequestMethod.GET})
    public RespBean findByName(String userName) {
        System.out.println(userName);

        User byUserName = service.findByUserName(userName);
        if (byUserName == null) {
            return RespBean.ok("ok");
        } else {
            return RespBean.error("error");
        }

    }


    @GetMapping("/verifyCode")
    public void verifyCode(HttpServletRequest request, HttpServletResponse resp) throws IOException {
        resp.setContentType("image/jpeg");
        VerificationCode code = new VerificationCode();
        BufferedImage image = code.getImage();
        String text = code.getText();
        HttpSession session = request.getSession(true);
        session.setAttribute("verify_code", text);
        System.out.println(session.toString());
        VerificationCode.output(image, resp.getOutputStream());
    }

    @RequestMapping(value = "/findById")
    public List<User> findById(Integer id) {
        System.out.println("ID是"+id);
        return service.findUserById(id);
    }

}
