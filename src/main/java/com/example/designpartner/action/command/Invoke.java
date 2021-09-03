package com.example.designpartner.action.command;

public class Invoke {

    private Command command;

    public Invoke(Command command) {
        this.command = command;
    }

    public void call() {
        command.execute();
    }
}
