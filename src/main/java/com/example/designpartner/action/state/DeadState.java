package com.example.designpartner.action.state;

public class DeadState implements State {

    @Override
    public void handle() {
        System.out.println("死亡状态");
    }
}
