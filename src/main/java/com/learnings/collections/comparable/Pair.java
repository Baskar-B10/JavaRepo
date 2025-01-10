package com.learnings.collections.comparable;

import java.util.*;

class Pair implements Comparable<Pair> {
    String f; // First name
    String l;  // Last name

    // Constructor 
    public Pair(String f, String l) {
        this.f = f;
        this.l = l;
    }

    // toString() method 
    // for displaying the Pair
    @Override
    public String toString() {
        return "(" + f + ", " + l + ")";
    }

    // compareTo method for 
    // comparison logic
    @Override
    public int compareTo(Pair p) {
      
        // Compare based on the first name 
        // (lexicographical order)
        if (this.f.compareTo(p.f) != 0) {
            return this.f.compareTo(p.f);
        }
      
        // If first names are the same, 
        // compare based on the last name
        return this.l.compareTo(p.l);
    }

    public static void main(String[] args) {
      
        // Create an array of Pair objects
        Pair[] p = {
            new Pair("raj", "kashup"),
            new Pair("rahul", "singh"),
            new Pair("reshmi", "dubey"),
        };


        System.out.println("Before Sorting:");
        for (Pair p1 : p) {
            System.out.println(p1);
        }

        // Sort the array of pairs
        Arrays.sort(p);

        System.out.println("\nAfter Sorting:");
        for (Pair p1 : p) {
            System.out.println(p1);
        }
    }
}