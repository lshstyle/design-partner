package com.example.designpartner.create.prototype;

import java.io.*;
import java.util.Date;

/**
 * 深拷贝
 */
public class DeepPrototype {

    public static void copy() throws IOException, ClassNotFoundException {
        Date date = new Date();
        Sheep sheep = new Sheep(date, "深拷贝");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(sheep);
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Sheep sheep2 = (Sheep) ois.readObject();
        date.setTime(20000000l);
        System.out.println("克隆前：" + sheep);
        System.out.println("克隆后：" + sheep2);

    }


}
