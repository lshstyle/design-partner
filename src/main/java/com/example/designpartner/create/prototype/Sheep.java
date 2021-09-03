package com.example.designpartner.create.prototype;

import java.io.Serializable;
import java.util.Date;

public class Sheep implements  Cloneable, Serializable {
    private Date date;
    private String name;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "date=" + date +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Sheep(Date date, String name) {
        this.date = date;
        this.name = name;
    }
}
