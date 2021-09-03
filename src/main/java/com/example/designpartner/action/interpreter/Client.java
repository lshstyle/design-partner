package com.example.designpartner.action.interpreter;

public class Client {

    public static void main(String[] args) {
        Context  context = new Context();
        context.freeRide("北京的老人");
        context.freeRide("北京的妇女");
        context.freeRide("武汉的老人");
        context.freeRide("武汉的老人");
        context.freeRide("深圳的老人");
        context.freeRide("深圳的儿童");
    }
}
