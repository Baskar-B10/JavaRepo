package com.program.arrays.oneDimensional.mergeElements;// Java Program to demonstrate merging
// two array using ArrayList

import java.util.ArrayList;
import java.util.List;

// Driver Class
public class MergeArraysByList {
 //Time Complexity: O(M + N)
 //Auxiliary Space: O(M + N)
    public static int[] mergeArraysUsingArrayList(int[] a,
                                                  int[] b)
    {
        // Create an ArrayList to store the merged
        // elements
        List<Integer> resultList = new ArrayList<>();

        // Iterate through a and add each element to
        // resultList
        for (int num : a) {
            resultList.add(num);
        }

        // Iterate through b and add each element to
        // resultList
        for (int num : b) {
            resultList.add(num);
        }

        // Convert the ArrayList to an array using
        // streams
        return resultList.stream()
          .mapToInt(Integer::intValue).toArray();
    }

      // DateWithDifferentLocale Function
    public static void main(String[] args)
    {
        // YearMonthDemo usage
        int a[] = { 30, 25, 40 };
        int b[] = { 45, 50, 55, 60, 65 };
        int[] result = mergeArraysUsingArrayList(a, b);
      
        // Display the merged array
        for (int i = 0; i < result.length; i = i + 1) {
            System.out.println(result[i]);
        }
    }
}
