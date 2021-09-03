package com.example.designpartner.action.mediator;

public class Finacial  implements Department{

    private Mediator mediator;

    public Finacial(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.register("finacial", this);
    }

    @Override
    public void selfAction() {
        System.out.println("管理资金");
    }

    @Override
    public void outAction() {
        System.out.println("转账汇款");
    }
}
