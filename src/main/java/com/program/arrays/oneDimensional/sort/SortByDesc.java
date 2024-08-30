package com.program.arrays.oneDimensional.sort;// Java program to Sort a Subarray in Descending order
// Using Arrays.sort()

// Importing Collections class and arrays classes
// from java.util package
import java.util.Arrays;
import java.util.Collections;

// DateWithDifferentLocale class
public class SortByDesc {
    //Time Complexity: O(N2) is the worst time Complexity of the method.
    // O(N log N) is the average time complexity of the Sort method.

    // DateWithDifferentLocale driver method
    public static void main(String[] args)
    {
        // Note that we have Integer here instead of
        // int[] as Collections.reverseOrder doesn't
        // work for primitive types.
        Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };

        // Sorts arr[] in descending order using
        // reverseOrder() method of Collections class
        // in Array.sort() as an argument to it
        Arrays.sort(arr, Collections.reverseOrder());

        // Printing the array as generated above
        System.out.println("Modified arr[] : "
                           + Arrays.toString(arr));
        //Time Complexity: O(nlog(n)) as it complexity of arrays.sort()
        //Auxiliary Space : O(1)

        Integer[] array
                = { 99, 12, -8, 12, 34, 110, 0, 121, 66, -110 };

        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(
                "Array in descending order: "
                        + Arrays.toString(array));
    }
}
