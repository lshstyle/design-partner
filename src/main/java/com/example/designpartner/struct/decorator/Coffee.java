package com.example.designpartner.struct.decorator;

/**
 * 具体组件
 */
public class Coffee implements Drink{

    @Override
    public Double price() {
        System.out.println("原味价格：10元");
        return 10.0;
    }

    @Override
    public String desc() {
        return "原味咖啡";
    }
}
