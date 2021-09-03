package com.example.designpartner.struct.facade;

public class SZTaxOffice implements  TaxOffice{

    @Override
    public void tax() {
        System.out.println("深圳税务办理税务许可");
    }
}
