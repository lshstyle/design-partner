package com.example.designpartner.struct.decorator;

public class Ice extends DrinkDecorator {

    public Ice(Drink drink) {
        super(drink);
    }

    @Override
    public Double price() {
        double price = super.price();
        System.out.println("免费加冰："+ price + "元");
        return price;
    }

    @Override
    public String desc() {
        String name  = super.desc();
        return name + " 加冰";
    }
}
