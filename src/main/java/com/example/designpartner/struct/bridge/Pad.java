package com.example.designpartner.struct.bridge;

public class Pad  extends Computer{

    public Pad(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("pad");
    }
}
