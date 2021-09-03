package com.example.designpartner.struct.decorator;

public class Suger extends DrinkDecorator {
    public Suger(Drink drink) {
        super(drink);
    }

    @Override
    public Double price() {
        double price = super.price()*1.5;
        System.out.println("加糖价格1.5倍：" + price + "元");
        return price;
    }

    @Override
    public String desc() {
        String name = super.desc();
        return name + " 加糖";
    }
}
