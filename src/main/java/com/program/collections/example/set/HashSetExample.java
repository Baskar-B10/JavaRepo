package com.program.collections.example.set;// Java program to demonstrate the
// working of a HashSet

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    // FileSearch Method
    public static void main(String args[])
    {
        // Creating HashSet and
        // adding elements
        HashSet<String> hs = new HashSet<String>();

        hs.add("Geeks");
        hs.add("For");
        hs.add("Geeks");
        hs.add("Is");
        hs.add("Very helpful");

        // Traversing elements
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
