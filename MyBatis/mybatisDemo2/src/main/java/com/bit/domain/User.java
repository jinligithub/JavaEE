package com.bit.domain;

import javax.xml.crypto.Data;
import java.io.Serializable;

/**
 * 实体类
 */
public class User implements Serializable {
    public Data getBrithday() {
        return brithday;
    }

    public void setBrithday(Data brithday) {
        this.brithday = brithday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 如果这里数字名和表里面的字段名一样采用方法一
     * 不一样采用方法二
     */
    private Integer id;
    private String username;
    private Data brithday;
    private String sex;
    private String address;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
