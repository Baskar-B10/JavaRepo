package com.learnings.basics.arrays.methods;// Java Program to Demonstrate Arrays Class
// Via asList() method

// Importing Arrays utility class
// from java.util package 
import java.util.Arrays;

// Main class 
class AsListDemo {
  
    // Main driver method 
    public static void main(String[] args)
    {
        // Get the Array
        int intArr[] = { 10, 20, 15, 22, 35 };

        // To convert the elements as List
        System.out.println("Integer Array as List: "
                           + Arrays.asList(intArr));
    }
}