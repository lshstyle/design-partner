package com.example.designpartner.action.visitor;

public class Client {

    public static void main(String[] args) {
        Staff engineer = new Engineer("李工程师");
        Staff manager = new Manager("李主管");
        Visitor ceo = new CEOVisitor();
        engineer.visitor(ceo);
        manager.visitor(ceo);
    }
}
