package com.example.designpartner.struct.adapter;

/**
 * 适配器
 */
public class Adapter  implements  Target{

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleReq() {
        System.out.println("我是适配器");
        adaptee.request();
    }
}
