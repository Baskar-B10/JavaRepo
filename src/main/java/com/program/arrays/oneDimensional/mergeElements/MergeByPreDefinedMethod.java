package com.program.arrays.oneDimensional.mergeElements;// Java Program to demonstrate merging
// two array using pre-defined method

import java.util.Arrays;

public class MergeByPreDefinedMethod {
    //Time Complexity: O(M + N)
    //Auxiliary Space: O(M + N)
    public static void main(String[] args)
    {
        // first array
        int[] a = { 10, 20, 30, 40 };

        // second array
        int[] b = { 50, 60, 70, 80 };

        // determines length of firstArray
        int aSize = a.length;
      
        // determines length of secondArray
        int bSize = b.length;
      
        // resultant array size
        int cSize = aSize + bSize;

        // create the resultant array
        int[] c = new int[cSize];

        // using the pre-defined function arraycopy
        System.arraycopy(a, 0, c, 0, aSize);
        System.arraycopy(b, 0, c, aSize, bSize);

        // prints the resultant array
        System.out.println(Arrays.toString(c));
    }
}
