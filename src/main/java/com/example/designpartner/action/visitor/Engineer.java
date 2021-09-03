package com.example.designpartner.action.visitor;

public class Engineer extends Staff{

    public Engineer(String name) {
        super(name);
    }

    @Override
    public void visitor(Visitor visitor) {
        visitor.visitor(this);
    }

    public String getProcess() {
        return "新产品研发进度80%";
    }
}
