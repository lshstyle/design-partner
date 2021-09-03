package com.example.designpartner.action.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    protected List<Observer> list = new ArrayList<Observer>();

    public void register(Observer observer) {
        list.add(observer);
    }

    public void remove(Observer observer) {
        list.remove(observer);
    }

    public void notice() {
        for (Observer observer : list) {
            observer.reciver();
        }
    }
}
