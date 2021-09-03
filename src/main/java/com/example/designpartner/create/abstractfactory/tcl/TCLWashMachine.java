package com.example.designpartner.create.abstractfactory.tcl;

import com.example.designpartner.create.abstractfactory.WashMachine;

public class TCLWashMachine implements WashMachine {

    @Override
    public void createWashMachine() {
        System.out.println("TCL 洗衣机");
    }
}
