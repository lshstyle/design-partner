package com.example.designpartner.create.abstractfactory.haier;

import com.example.designpartner.create.abstractfactory.TV;

public class HaierTV implements TV {

    @Override
    public void createTV() {
        System.out.println("haier 电视机");
    }

}
