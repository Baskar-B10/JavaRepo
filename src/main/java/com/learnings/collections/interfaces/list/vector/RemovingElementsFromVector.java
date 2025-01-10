package com.learnings.collections.interfaces.list.vector;// Java code illustrating the removal
// of elements from vector

import java.util.*;
import java.io.*;

class RemovingElementsFromVector {
  
    public static void main(String[] arg)
    {
        // Create default vector of capacity 10
        Vector v = new Vector();

        // Add elements using add() method
        v.add(1);
        v.add(2);
        v.add("Geeks");
        v.add("forGeeks");
        v.add(4);

        // Removing first occurrence element at 1
        v.remove(1);

        // Checking vector
        System.out.println("after removal: " + v);
    }
}