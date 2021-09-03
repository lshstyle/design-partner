package com.example.designpartner.create.abstractfactory;

import com.example.designpartner.create.abstractfactory.haier.HaierFactory;
import com.example.designpartner.create.abstractfactory.tcl.TCLFactory;

public class Client {

    public static void main(String[] args) {
        MachineFactory  haierFactory = new HaierFactory();
        TV haierTV = haierFactory.watchTV();
        WashMachine haierWash = haierFactory.washCloth();
        AirConditioner haierAir = haierFactory.turnOn();

        MachineFactory tclFactory = new TCLFactory();
        TV tclTV = tclFactory.watchTV();
        WashMachine tclWash = tclFactory.washCloth();
        AirConditioner tclAir = tclFactory.turnOn();
    }
}
