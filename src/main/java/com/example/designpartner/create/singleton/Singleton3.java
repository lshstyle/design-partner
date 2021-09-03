package com.example.designpartner.create.singleton;

/**
 * 静态内部类
 */
public class Singleton3 {

    private Singleton3() {

    }

    private static class Singleton3Holder {
        private static Singleton3 INSTANCE  = new Singleton3();
    }

    public static Singleton3 getInstance() {
        return Singleton3Holder.INSTANCE;
    }
}
