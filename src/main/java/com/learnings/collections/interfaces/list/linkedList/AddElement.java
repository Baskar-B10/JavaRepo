package com.learnings.collections.interfaces.list.linkedList;// Java program to add elements
// to a LinkedList

import java.util.*;

public class AddElement {

    public static void main(String args[])
    {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Geeks");
        ll.add("Geeks");
        ll.add(1, "For");

        System.out.println(ll);
    }
}