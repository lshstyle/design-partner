package com.example.designpartner.action.interpreter;

public class Context {

    private String[] cities = {"广州", "深圳"};
    private String[] persons = {"老人", "妇女", "儿童"};
    private Expression expression;

    public Context() {
        Expression city = new TerminalExpression(cities);
        Expression person = new TerminalExpression(persons);
        expression = new AndExpression(city, person);
    }

    public void freeRide(String info) {
        boolean ok = expression.interpret(info);
        if (ok) {
            System.out.println("您是" + info+ "本次乘坐免费");

        } else {
            System.out.println(info + " 请支付乘车费用");
        }

    }
}
