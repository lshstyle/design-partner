package com.example.designpartner.create.abstractfactory.haier;

import com.example.designpartner.create.abstractfactory.WashMachine;

public class HaierWashMachine implements WashMachine {


    @Override
    public void createWashMachine() {
        System.out.println("haier 洗衣机");
    }
}
