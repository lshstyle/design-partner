package com.example.designpartner.action.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCollections  implements  MyCollections{

    private List<Object> list = new ArrayList<Object>();

    public void add(Object obj) {
        this.list.add(obj);
    }

    public void remove(Object obj) {
        this.list.remove(obj);
    }

    public List<Object> getList() {
        return this.list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public MyIterator getIterator() {
        return new ConcreteIterator();
    }

    private class ConcreteIterator implements MyIterator {
        private int cursor;

        public void first() {
            cursor = 0;
        }

        public void next() {
            if (cursor < list.size()) {
                cursor++;
            }
        }

        public boolean hasNext() {
            return cursor < list.size();
        }

        public boolean isFirst() {
            return cursor == 0;
        }

        public boolean isLast() {
            return cursor == list.size()-1;
        }

        public Object getCurrentObj() {
            return list.get(cursor);
        }
    }
}
