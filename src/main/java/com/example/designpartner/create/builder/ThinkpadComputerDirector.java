package com.example.designpartner.create.builder;

/**
 * 指挥者负责组建
 */
public class ThinkpadComputerDirector  implements  ComputerDirector{

    private ComputerBuilder builder;

    public ThinkpadComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    @Override
    public Computer directorComputer() {
        CPU cpu = builder.buildCPU();
        Keyboard keyboard = builder.buildKeyboard();
        Mouse mouse = builder.buildMouse();

        Computer computer = new Computer();
        computer.setCpu(cpu);
        computer.setKeyboard(keyboard);
        computer.setMouse(mouse);

        return computer;
    }
}
