package com.example.designpartner.action.command;

public class Client {

    public static void main(String[] args) {
        Command command = new CocreteCommand(new Reciver());
        Invoke invoke = new Invoke(command);
        invoke.call();
    }
}
