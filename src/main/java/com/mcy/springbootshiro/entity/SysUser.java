package com.mcy.springbootshiro.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2020/5/6 -9:11
 */
public class SysUser {
    private Integer id;
    private String username;
    private String password;
    private String name;
    @JsonIgnore
    private List<SysRole> roles=new ArrayList<>();
    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Column(length = 20,unique=true)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    @Column(length = 100)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Column(length=20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   @ManyToOne(cascade = CascadeType.REFRESH,fetch = FetchType.EAGER)
    public List<SysRole> getRoles() {
        return roles;
    }

    public void setRoles(List<SysRole> roles) {
        this.roles = roles;
    }
}
