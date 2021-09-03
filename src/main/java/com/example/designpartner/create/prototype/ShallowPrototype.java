package com.example.designpartner.create.prototype;

import java.util.Date;

public class ShallowPrototype {

    public static void copy() throws CloneNotSupportedException {
        Date date = new Date(10000l);
        Sheep sheep = new Sheep(date, "浅拷贝");
        Sheep sheep2 = (Sheep) sheep.clone();
        date.setTime(2000000l);
        System.out.println("克隆前:" +sheep);
        System.out.println("克隆后:" +sheep2);

    }
}
