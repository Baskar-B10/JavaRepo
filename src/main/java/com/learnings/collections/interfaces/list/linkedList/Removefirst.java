package com.learnings.collections.interfaces.list.linkedList;

import java.util.LinkedList;
public class Removefirst {
    public static void main(String args[]) {

        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("LinkedList:" + list);
        System.out.println("The  remove first element is: " + list.removeFirst());
        // Displaying the final list
        System.out.println("Final LinkedList:" + list);
    }
}