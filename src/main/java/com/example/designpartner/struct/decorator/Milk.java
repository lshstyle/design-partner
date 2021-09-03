package com.example.designpartner.struct.decorator;

public class Milk extends DrinkDecorator {

    public Milk(Drink drink) {
        super(drink);
    }

    @Override
    public Double price() {
        double price =super.price()*2;
        System.out.println("加奶价格2倍：" + price + "元");
        return price;
    }

    @Override
    public String desc() {
        String name  = super.desc();
        return name + " 加奶";
    }
}
