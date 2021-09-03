package com.example.designpartner.action.command;

public class CocreteCommand  implements  Command {

    private Reciver reciver;

    public CocreteCommand(Reciver reciver) {
        this.reciver = reciver;
    }

    @Override
    public void execute() {
        System.out.println("开始执行任务");
        reciver.action();
    }
}
