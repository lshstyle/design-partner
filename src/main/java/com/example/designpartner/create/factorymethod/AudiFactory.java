package com.example.designpartner.create.factorymethod;

public class AudiFactory  implements  CarFactory {

    @Override
    public Car createCar() {
        return new Audi();
    }
}
