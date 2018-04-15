package com.itplayer.core.system.entity;

import com.itplayer.core.base.entity.MetaEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by caijun.yang on 2018/4/11
 */
@Entity
@Table(name = "tbl_area")
public class Manager extends MetaEntity {

    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String realName;
    @Column
    private String mobile;
    @Column
    private String email;
    @Column
    private String addr;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
