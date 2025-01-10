package com.learnings.basics.arrays.methods;// Java Program to Demonstrate Arrays Class
// Via asList() method

// Importing Arrays utility class
// from java.util package 
import java.util.Arrays;

// Main class 
class BinarySearchDemo {
  
    // Main driver method 
    public static void main(String[] args)
    {
        // Get the Array
        int intArr[] = { 10, 20, 15, 22, 35 };

        Arrays.sort(intArr);

        int intKey = 22;

        // Print the key and corresponding index
        System.out.println(
                intKey + " found at index = "
                        + Arrays.binarySearch(intArr, intKey));

        System.out.println(
                intKey
                        + " found at index = "
                        + Arrays
                        .binarySearch(intArr, 1, 3, intKey));
    }
}