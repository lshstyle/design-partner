package com.example.designpartner.action.state;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new WaitState());
        context.setState(new BlockState());
    }
}
