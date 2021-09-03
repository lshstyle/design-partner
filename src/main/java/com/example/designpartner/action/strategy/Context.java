package com.example.designpartner.action.strategy;

public class Context {

    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void printPrice(double price) {
        System.out.println("报价：" + strategy.price(price));
    }
}
