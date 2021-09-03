package com.example.designpartner.struct.proxy;

public class RealPerson implements  Person{
    @Override
    public void eat() {
        System.out.println("real eat ......");
    }

    @Override
    public void work() {

        System.out.println("real work ......");
    }

    @Override
    public void sleep() {

        System.out.println("real sleep ......");
    }
}
