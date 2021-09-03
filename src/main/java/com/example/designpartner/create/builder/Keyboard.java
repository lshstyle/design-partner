package com.example.designpartner.create.builder;

import java.util.Date;

public class Keyboard {

    private Date createDate;
    private String name;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Keyboard(String name) {
        this.name = name;
    }
}
