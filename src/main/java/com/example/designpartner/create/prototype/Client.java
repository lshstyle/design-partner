package com.example.designpartner.create.prototype;

import java.io.IOException;

public class Client {

    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {
        //深拷贝
        DeepPrototype.copy();

        //浅拷贝
        ShallowPrototype.copy();
    }
}
