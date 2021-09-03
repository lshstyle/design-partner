package com.example.designpartner.action.templatemethod;

public abstract class BankTemplate {

    public void takeNumber() {
        System.out.println("排队取号");
    }

    public abstract void trascat();

    public void evaluate() {
        System.out.println("反馈评价");
    }

    public final void process() {
        takeNumber();
        trascat();
        evaluate();
    }
}
