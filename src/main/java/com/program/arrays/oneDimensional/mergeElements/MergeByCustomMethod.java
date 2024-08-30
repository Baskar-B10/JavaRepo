package com.program.arrays.oneDimensional.mergeElements;// Java Program to demonstrate merging
// two array without using pre-defined method

public class MergeByCustomMethod {
    //Time Complexity: O(M + N)
    //Auxiliary Space: O(M + N)
    public static void main(String[] args)
    {

        // first array
        int a[] = { 30, 25, 40 };
        // second array
        int b[] = { 45, 50, 55, 60, 65 };

        // determining length of first array
        int aSize = a.length;
        // determining length of second array
        int bSize = b.length;

        // resultant array size
        int cSize = aSize + bSize;

        // Creating a new array
        int[] c = new int[cSize];

        // Loop to store the elements of first
        // array into resultant array
        for (int i = 0; i < aSize; i = i + 1) {
            // Storing the elements in 
            // the resultant array
            c[i] = a[i];
        }

        // Loop to concat the elements of second 
        // array into resultant array
        for (int i = 0; i < bSize; i = i + 1) {

            // Storing the elements in the 
            // resultant array
            c[aSize + i] = b[i];
        }

        // Loop to print the elements of 
        // resultant array after merging
        for (int i = 0; i < cSize; i = i + 1) {
            
            // print the element
            System.out.println(c[i]);
        }
    }
}
