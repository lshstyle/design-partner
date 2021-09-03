package com.example.designpartner.struct.bridge;

/**
 * 抽象化角色
 */
public class Computer {

    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void sale() {
        brand.sale();
    }
}
