package com.learnings.collections.interfaces.list.linkedList;

import java.util.LinkedList;
public class RemoveLast {
    public static void main(String args[])
    {
        
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("LinkedList:" + list);
        // Remove the tail using removeLast()
        System.out.println("The last element is removed: " + list.removeLast());
        // Displaying the final list
        System.out.println("Final LinkedList:" + list);
        // Remove the tail using removeLast()
        System.out.println("The last element is removed: " + list.removeLast());
        // Displaying the final list
        System.out.println("Final LinkedList:" + list);
    }
}