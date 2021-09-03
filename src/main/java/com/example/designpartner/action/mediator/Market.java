package com.example.designpartner.action.mediator;

public class Market  implements  Department{

    private Mediator mediator;

    public Market(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.register("market", this);
    }

    @Override
    public void selfAction() {
        System.out.println("承接项目");
    }

    @Override
    public void outAction() {
        System.out.println("缺少开拓市场资金");
    }
}
