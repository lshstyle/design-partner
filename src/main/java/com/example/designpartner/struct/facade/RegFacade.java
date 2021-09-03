package com.example.designpartner.struct.facade;

public class RegFacade {

    public void register() {
        Bank bank = new BankOfChina();
        TaxOffice taxOffice = new SZTaxOffice();
        bank.openAccount();
        taxOffice.tax();
    }
}
