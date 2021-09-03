package com.example.designpartner.struct.decorator;

/**
 * 装饰类
 */
public class DrinkDecorator implements Drink {

    private Drink drink;

    public DrinkDecorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public Double price() {
        return this.drink.price();
    }

    @Override
    public String desc() {
        return this.drink.desc();
    }
}
