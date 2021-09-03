package com.example.designpartner.struct.decorator;

public class Client {

    public static void main(String[] args) {
        System.out.println("===购买咖啡===");
        Drink coffee = new Coffee();
        coffee.desc();
        coffee.price();
        System.out.println("===咖啡加奶===");
        Drink milk = new Milk(coffee);
        milk.desc();
        milk.price();
        System.out.println("===咖啡加奶加冰===");
        Drink ice = new Ice(milk);
        ice.desc();
        ice.price();
        System.out.println("===咖啡加奶加冰加糖===");
        Drink suger = new Suger(ice);
        suger.price();
        suger.desc();
    }
}
