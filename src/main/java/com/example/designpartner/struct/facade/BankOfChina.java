package com.example.designpartner.struct.facade;

public class BankOfChina  implements  Bank{

    @Override
    public void openAccount() {
        System.out.println("中国银行开户");
    }
}
