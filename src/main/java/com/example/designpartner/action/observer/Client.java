package com.example.designpartner.action.observer;

public class Client {

    public static void main(String[] args) {
        Observer observerA = new ConcreteObserver("A");
        Observer observerB = new ConcreteObserver("B");
        Observer observerC = new ConcreteObserver("C");
        Observer observerD = new ConcreteObserver("D");
        Observer observerE = new ConcreteObserver("E");
        Observer observerF = new ConcreteObserver("F");
        Subject subject = new ConcreteSubject();
        subject.register(observerA);
        subject.register(observerB);
        subject.register(observerC);
        subject.register(observerD);
        subject.register(observerE);
        subject.register(observerF);

        subject.notice();

    }
}
