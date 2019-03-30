package com.mx.springboot.dubbo.model;

import java.io.Serializable;

public class User implements Serializable{
    private int uid;
    private String name;

    public User() {
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
