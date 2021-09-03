package com.example.designpartner.create.abstractfactory.tcl;

import com.example.designpartner.create.abstractfactory.AirConditioner;
import com.example.designpartner.create.abstractfactory.MachineFactory;
import com.example.designpartner.create.abstractfactory.TV;
import com.example.designpartner.create.abstractfactory.WashMachine;

public class TCLFactory implements MachineFactory {
    @Override
    public TV watchTV() {
        return new TCLTV();
    }

    @Override
    public WashMachine washCloth() {
        return new TCLWashMachine();   }

    @Override
    public AirConditioner turnOn() {
        return new TCLAirConditioner();
    }
}
