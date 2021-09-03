package com.example.designpartner.struct.bridge;

public class PC extends Computer{

    public PC(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("PC");
    }
}
