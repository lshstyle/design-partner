package com.example.designpartner.action.visitor;

public class Manager  extends Staff {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void visitor(Visitor visitor) {
        visitor.visitor(this);
    }

    public String getProducts() {
        return "产品生产任务完成90%";
    }
}
