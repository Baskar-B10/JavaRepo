package com.learnings.basics.arrays.methods;// Java program to demonstrate
// Arrays.sort() method

import java.util.Arrays;

public class SortDemo {
    public static void main(String[] args)
    {

        // Get the Array
        int intArr[] = { 10, 20, 15, 22, 35 };

        // To sort the array using normal sort-
        Arrays.sort(intArr);

        System.out.println("Integer Array: "
                           + Arrays.toString(intArr));

        Arrays.sort(intArr, 1, 3);

        System.out.println("Integer Array: "
                + Arrays.toString(intArr));
    }
}