package com.program.stream;// Java Program to demonstrate merging
// two array using Java Stream 
import java.util.Arrays;
import java.util.stream.IntStream;

// Driver Class
public class MergeTwoArraysUsingStreams {
      // main function
    //Time Complexity: O(M + N)
      //Auxiliary Space: O(M + N)
    public static void main(String[] args) {
        // First array
        int a[] = {30, 25, 40};
        // Second array
        int b[] = {45, 50, 55, 60, 65};

        // Merging arrays using Java Streams
        int[] c = mergeArraysUsingStreams(a, b);

        // Print the elements of the merged array
        Arrays.stream(c).forEach(System.out::println);
    }

    public static int[] mergeArraysUsingStreams(int[] arr1, int[] arr2) {
        return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
    }
}
