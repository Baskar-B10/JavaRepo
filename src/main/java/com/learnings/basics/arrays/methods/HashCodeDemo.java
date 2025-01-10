package com.learnings.basics.arrays.methods;// Java program to demonstrate
// Arrays.hashCode() method

import java.util.Arrays;

public class HashCodeDemo {
    public static void main(String[] args)
    {

        // Get the Array
        int intArr[] = { 10, 20, 15, 22, 35 };

        // To get the hashCode of the arrays
        System.out.println("Integer Array: "
                           + Arrays.hashCode(intArr));
    }
}