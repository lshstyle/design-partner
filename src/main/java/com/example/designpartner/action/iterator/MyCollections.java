package com.example.designpartner.action.iterator;

import java.util.List;

public interface MyCollections {

    void add(Object obj);
    void remove(Object obj);
    List<Object> getList();
    MyIterator getIterator();
}
