package com.example.designpartner.create.builder;

import java.util.Date;

public class CPU {

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

    public CPU(String name) {
        this.name = name;
    }
}
