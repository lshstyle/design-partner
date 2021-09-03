package com.example.designpartner.struct.proxy.statics;

import com.example.designpartner.struct.proxy.Person;

public class Proxy implements Person {

    private Person person;

    public Proxy(Person person) {
        this.person = person;
    }

    @Override
    public void eat() {
        person.eat();
    }

    @Override
    public void work() {
        System.out.println("proxy work .........");
    }

    @Override
    public void sleep() {
        person.sleep();
    }
}
