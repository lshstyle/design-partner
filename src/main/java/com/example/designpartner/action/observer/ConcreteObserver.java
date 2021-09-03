package com.example.designpartner.action.observer;

public class ConcreteObserver  implements Observer{
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void reciver() {
        System.out.println(name + "收到消息");
    }
}
