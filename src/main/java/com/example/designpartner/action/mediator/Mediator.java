package com.example.designpartner.action.mediator;

public interface Mediator {
    void register(String name, Department department);
    void command(String name);
}
