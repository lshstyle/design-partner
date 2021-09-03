package com.example.designpartner.create.abstractfactory.tcl;

import com.example.designpartner.create.abstractfactory.TV;

public class TCLTV implements TV {
    @Override
    public void createTV() {
        System.out.println("TCL 电视机");
    }
}
