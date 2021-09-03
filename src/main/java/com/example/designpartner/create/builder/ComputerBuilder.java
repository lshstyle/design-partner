package com.example.designpartner.create.builder;

/**
 * 建造者抽象类
 */
public interface ComputerBuilder {

    CPU buildCPU();
    Keyboard buildKeyboard();
    Mouse buildMouse();
}
