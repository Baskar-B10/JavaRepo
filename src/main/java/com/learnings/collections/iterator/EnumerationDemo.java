package com.learnings.collections.iterator;// Demonstrating iterator references in Java
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class EnumerationDemo {

    public static void main(String[] args) {
      
        // Create a Vector object
        Vector v = new Vector();

        // Initialize iterators
        Enumeration e = v.elements();
        Iterator itr = v.iterator();
        ListIterator ltr = v.listIterator();

        // Print class names of iterators
        System.out.println(e.getClass().getName());
        System.out.println(itr.getClass().getName());
        System.out.println(ltr.getClass().getName());
    }
}