package com.learnings.collections.interfaces.set;// Java Program Implementing SortedSet
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetCreation {
    
      public static void main(String args[]) 
    {
        
        // Create a SortedSet of Strings
        SortedSet<String> ss = new TreeSet<>();
        
        // Displaying the SortedSet
        System.out.println("SortedSet elements: " + ss);
    }
}