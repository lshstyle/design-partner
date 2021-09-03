package com.example.designpartner.action.strategy;

public class NewCust implements Strategy{

    @Override
    public double price(double standPrice) {
        return standPrice;
    }
}
