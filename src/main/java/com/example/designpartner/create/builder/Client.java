package com.example.designpartner.create.builder;

public class Client {

    public static void main(String[] args) {
        ComputerDirector director = new ThinkpadComputerDirector(new ThinkpadComputerBuilder());
        Computer computer = director.directorComputer();
        System.out.println(computer.getCpu().getName());
        System.out.println(computer.getKeyboard().getName());
        System.out.println(computer.getMouse().getName());
    }
}
