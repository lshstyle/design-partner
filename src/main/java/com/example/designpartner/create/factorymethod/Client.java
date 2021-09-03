package com.example.designpartner.create.factorymethod;

public class Client {


    public static void main(String[] args) {
        Car audi = new AudiFactory().createCar();
        Car benz = new BenzFactory().createCar();
    }
}
