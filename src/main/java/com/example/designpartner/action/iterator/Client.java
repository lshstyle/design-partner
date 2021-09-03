package com.example.designpartner.action.iterator;

public class Client {


    public static void main(String[] args) {
        ConcreteCollections  col = new ConcreteCollections();
        col.add("a");
        col.add("b");
        col.add("c");
        col.add("d");

        MyIterator iterator = col.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.getCurrentObj());
            iterator.next();
        }
    }
}
