package com.example.designpartner.create.singleton;

import java.io.ObjectStreamException;

/**
 * 懒汉模式 DCL
 */
public class Singleton1 {

    /**
     * volatile 防止指令重排
     */
    private static volatile Singleton1 instance;

    private Singleton1() {
        //防止反射
        if(instance!=null){
            throw new RuntimeException();
        }
    }

    public static Singleton1 getInstance() {
        //判断是否需要加锁
        if (null != instance) {
            return instance;
        }
        synchronized (Singleton1.class) {
            //判断是否需要实例化
            if (null == instance) {
                instance = new Singleton1();
            }
        }
        return instance;
    }

    //防止反序列化
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }

    //防止克隆
    public Object clone() {
        return instance;
    }
}
