package com.learnings.basics.arrays.methods;// Java program to demonstrate
// Arrays.toString() method

import java.util.Arrays;

public class ToStringDemo {
    public static void main(String[] args)
    {

        // Get the Array
        int intArr[] = { 10, 20, 15, 22, 35 };

        // To print the elements in one line
        System.out.println("Integer Array: "
                           + Arrays.toString(intArr));
    }
}