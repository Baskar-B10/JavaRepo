package com.learnings.collections.interfaces.map.linkedHashMap;// Removal of Elements from LinkedHashMap
import java.util.*;

class RemoveElement {

    public static void main(String args[]) {
      
        // Initialization of a LinkedHashMap
        // using Generics
        LinkedHashMap<Integer, String> lhm
            = new LinkedHashMap<Integer, String>();

        // Inserting the Elements
        // using put() method
        lhm.put(3, "Geeks");
        lhm.put(2, "Geeks");
        lhm.put(1, "Geeks");
        lhm.put(4, "For");

        // Printing the mappings to the console
        System.out.println("" + lhm);

        // Removing the mapping with Key 4
        lhm.remove(4);

        // Printing the updated map
        System.out.println("" + lhm);
    }
}