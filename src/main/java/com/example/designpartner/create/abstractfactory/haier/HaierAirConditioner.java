package com.example.designpartner.create.abstractfactory.haier;

import com.example.designpartner.create.abstractfactory.AirConditioner;

public class HaierAirConditioner implements AirConditioner {
    @Override
    public void createAirCond() {
        System.out.println("haier 空调");
    }
}
