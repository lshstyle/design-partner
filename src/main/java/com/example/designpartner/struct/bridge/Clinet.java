package com.example.designpartner.struct.bridge;

public class Clinet {

    public static void main(String[] args) {
        Computer computer = new PC(new Dell());
        computer.sale();
    }

}
