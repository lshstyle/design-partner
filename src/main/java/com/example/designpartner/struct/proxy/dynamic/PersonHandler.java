package com.example.designpartner.struct.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PersonHandler  implements InvocationHandler {

    private Object object;

    public PersonHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before do invoke..................");
        Object object = method.invoke(this.object, args);
        System.out.println("after do invoke...................");
        return object;
    }
}
