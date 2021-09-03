package com.example.designpartner.create.abstractfactory.haier;

import com.example.designpartner.create.abstractfactory.AirConditioner;
import com.example.designpartner.create.abstractfactory.MachineFactory;
import com.example.designpartner.create.abstractfactory.TV;
import com.example.designpartner.create.abstractfactory.WashMachine;

public class HaierFactory implements MachineFactory {
    @Override
    public TV watchTV() {
        return new HaierTV();
    }

    @Override
    public WashMachine washCloth() {
        return new HaierWashMachine();   }

    @Override
    public AirConditioner turnOn() {
        return new HaierAirConditioner();
    }
}
