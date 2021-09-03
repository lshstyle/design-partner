package com.example.designpartner.action.templatemethod;

public class Client {

    public static void main(String[] args) {
        BankTemplate template = new DrawMoney();
        template.process();

        //lambada表达式
        BankTemplate template1 = new BankTemplate() {
            @Override
            public void trascat() {
                System.out.println("存钱");
            }
        };
        template1.process();
    }
}
