package com.example.designpartner.create.abstractfactory.tcl;

import com.example.designpartner.create.abstractfactory.AirConditioner;

public class TCLAirConditioner implements AirConditioner {

    @Override
    public void createAirCond() {
        System.out.println("TCL 洗衣机");
    }

}
