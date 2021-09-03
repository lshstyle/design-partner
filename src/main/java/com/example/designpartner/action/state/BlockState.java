package com.example.designpartner.action.state;

public class BlockState implements  State{
    @Override
    public void handle() {
        System.out.println("阻塞状态");
    }
}
