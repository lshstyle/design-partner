package com.example.designpartner.action.strategy;

public class OldCust  implements  Strategy {

    @Override
    public double price(double standPrice) {
        return standPrice * 0.85;
    }
}
