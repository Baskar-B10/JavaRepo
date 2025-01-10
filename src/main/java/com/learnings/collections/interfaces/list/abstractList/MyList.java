package com.learnings.collections.interfaces.list.abstractList;

import java.util.AbstractList;
import java.util.List;

public class MyList extends AbstractList<Integer> {
    private int size;

    public MyList(int size) {
        this.size = size;
    }

    @Override
    public Integer get(int index) {
        return index;
    }

    @Override
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        List<Integer> list = new MyList(5);
        for (int i : list) {
            System.out.println(i);
        }
    }
}