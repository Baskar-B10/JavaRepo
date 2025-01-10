package com.learnings.collections.classes;// Removing elements from a Collection
import java.util.*;

public class RemoveDemo {
    public static void main(String[] argv) throws Exception {

        // Creating object of HashSet
        Collection<Integer> hs1 = new HashSet<Integer>();

        hs1.add(1);
        hs1.add(2);
        hs1.add(3);
        hs1.add(4);
        hs1.add(5);

        System.out.println("Initial set: " + hs1);
        
          // remove a particular element
          hs1.remove(4);
      
        System.out.println("Set after removing 4: " + hs1);
      
        // Creating another object of HashSet
        Collection<Integer> hs2 = new HashSet<Integer>();
        hs2.add(1);
        hs2.add(2);
        hs2.add(3);

        System.out.println("Collection Elements to be removed: " + hs2);

        // Removing elements from hs1
        // specified in hs2
        // using removeAll() method
        hs1.removeAll(hs2);

        System.out.println("Set 1 after removeAll() operation: " + hs1);
    }
}