package com.example.designpartner.create.builder;

public class ThinkpadComputerBuilder  implements  ComputerBuilder{


    @Override
    public CPU buildCPU() {
        return new CPU("ThinkPad CPU");
    }

    @Override
    public Keyboard buildKeyboard() {
        return new Keyboard("ThinkPad Keyboard");
    }

    @Override
    public Mouse buildMouse() {
        return new Mouse("ThinkePad Mouse");
    }
}
