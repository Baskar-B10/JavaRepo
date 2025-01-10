package com.learnings.basics.arrays.methods;// Java program to demonstrate
// Arrays.compare() method

import java.util.Arrays;

public class CompareDemo {
    public static void main(String[] args)
    {

        // Get the Array
        int intArr[] = { 10, 20, 15, 22, 35 };

        // Get the second Array
        int intArr1[] = { 10, 15, 22 };

        // To compare both arrays
        System.out.println("Integer Arrays on comparison: "
                           + Arrays.compare(intArr, intArr1));

        // To compare both arrays
        System.out.println("Integer Arrays on comparison: "
                + Arrays.compareUnsigned(intArr, intArr1));
    }
}