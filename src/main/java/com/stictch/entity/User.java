package com.stictch.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 * @author demo
 * @title User
 * @description
 * @date 2020/08/22/21:02
 */
@Setter
@Getter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)

public class User implements Serializable, UserDetails {

    /**
     * 普通用户id
     */

    private Integer userId;
    /**
     * 普通用户昵称
     */

    private String userName;
    /**
     * 普通用户密码
     */
    private String passWord;
    /**
     * 普通用户年龄
     */
    private Integer age;
    /**
     * 普通用户性别
     */
    private String gender;
    /**
     * 普通用户电话号码
     */
    private String phone;
    /**
     * 用户头像
     */
    private String picture;
    /**
     * 公司名称
     */
    private String companyName;
    /**
     * 公司地址
     */
    private String companyLocation;
    /**
     * 营业执照图片
     */
    private String license;
    /**
     * 普通用户邮箱
     */
    private String email;
    /**
     * 普通用户的特长
     */
    private String special;

    private List<Role> roles;

    /**
     * 用来获取当前用户所具有的角色
     *
     * @return
     */
    @JsonIgnore
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (Role role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
        }
        return authorities;
    }

    @Override
    public String getPassword() {
        return this.passWord;
    }

    @Override
    public String getUsername() {
        return this.userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }


}
