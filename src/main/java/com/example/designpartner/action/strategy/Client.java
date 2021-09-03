package com.example.designpartner.action.strategy;

public class Client {

    public static void main(String[] args) {
        Context context = new Context(new OldCust());
        context.printPrice(100);
    }
}
