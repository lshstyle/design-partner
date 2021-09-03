package com.example.designpartner.action.state;

public class WaitState implements State{
    @Override
    public void handle() {
        System.out.println("等待状态");
    }
}
