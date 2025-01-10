package com.learnings.collections.comparable;

import java.util.*;

class Number implements Comparable<Number> {
    int v; // Value of the number

    // Constructor
    public Number(int v) {
        this.v = v;
    }

    // toString() for displaying the number
    @Override
    public String toString() {
        return String.valueOf(v);
    }

    // compareTo() method to 
    // define sorting logic
    @Override
    public int compareTo(Number o) {
      
        // Ascending order
        return this.v - o.v; 
    }

    public static void main(String[] args) {
      
        // Create an array of Number objects
        Number[] n = { new Number(4), new Number(1), 
                      new Number(7), new Number(2) };

        System.out.println("Before Sorting: " 
                           + Arrays.toString(n));

        // Sort the array
        Arrays.sort(n);

        // Display numbers after sorting
        System.out.println("After Sorting: " + Arrays.toString(n));
    }
}