package com.example.designpartner.action.mediator;

public class Development  implements  Department {

    private Mediator mediator;

    public Development(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.register("develop", this);
    }

    @Override
    public void selfAction() {
        System.out.println("开发项目");
    }

    @Override
    public void outAction() {
        System.out.println("缺乏研发经费");
    }
}
