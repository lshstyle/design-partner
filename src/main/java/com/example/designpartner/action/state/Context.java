package com.example.designpartner.action.state;

public class Context {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        state.handle();
    }
}
