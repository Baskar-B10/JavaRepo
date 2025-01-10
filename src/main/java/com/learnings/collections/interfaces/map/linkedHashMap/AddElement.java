package com.learnings.collections.interfaces.map.linkedHashMap;// Adding Elements to a LinkedHashMap
import java.util.*;

class AddElement {

    public static void main(String args[]) {

        // Initialization of a LinkedHashMap
        // using Generics
        LinkedHashMap<Integer, String> lhm
            = new LinkedHashMap<Integer, String>();

        // Add mappings to Map
        // using put() method
        lhm.put(3, "Geeks");
        lhm.put(2, "For");
        lhm.put(1, "Geeks");

        // Printing mappings to the console
        System.out.println(""
                           + lhm);
    }
}