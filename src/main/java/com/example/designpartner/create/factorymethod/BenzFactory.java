package com.example.designpartner.create.factorymethod;

public class BenzFactory  implements  CarFactory {

    @Override
    public Car createCar() {
        return new Benz();
    }
}
