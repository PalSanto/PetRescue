package com.demxntia.Petrescue.PetRescueInfo;

import java.util.Date;

public class Administrator {

    private Integer id;

    private String username;  //管理员用户名

    private String password;  //管理员密码

    private Date useTime;  //进行管理的时间


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Date getUseTime() {
        return useTime;
    }

    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }
}
