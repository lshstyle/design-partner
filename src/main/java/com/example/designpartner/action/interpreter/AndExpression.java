package com.example.designpartner.action.interpreter;

public class AndExpression  implements  Expression{

    private Expression city;
    private Expression person;


    public AndExpression(Expression city, Expression person) {
        this.city = city;
        this.person = person;
    }

    @Override
    public boolean interpret(String info) {
        String[]   arr = info.split("的");

        return city.interpret(arr[0]) && person.interpret(arr[1]);
    }
}
