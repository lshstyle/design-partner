package com.example.designpartner.struct.proxy;

import com.example.designpartner.struct.proxy.dynamic.PersonHandler;
import com.example.designpartner.struct.proxy.statics.Proxy;

public class Client {

    public static void main(String[] args) {

        //===========静态代理==================//
        System.out.println("==========静态代理==============");
        Person person  = new RealPerson();
        Proxy proxy = new Proxy(person);

        proxy.eat();
        proxy.sleep();
        proxy.work();

        //=============动态代理=============//
        System.out.println("============动态代理=============");
        Person realPerson = new RealPerson();
        PersonHandler handler = new PersonHandler(realPerson);
        Person personProxy = (Person)java.lang.reflect.Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Person.class}, handler);
        personProxy.work();
    }
}
