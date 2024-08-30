package com.program.arrays.oneDimensional.sort;// Java Program to Sort the Elements
// In Descending Order
import java.util.*;

// Driver Class
class SortByDescCustom {
      // DateWithDifferentLocale Methods
    //Time Complexity: O(N2) ,
      // Arrays.sort(int[]) used dual pivot quick sort having worst case complexity of  O(N2).
      // And the average time complexity of Array.sort(int[]) is O(NlogN).
    public static void main(String[] args)
    {
        // Initializing the array
        int array[] = { 1, 2, 3, 4, 5, 6 };

        // Sorting the array in ascending order
        Arrays.sort(array);

        // Reversing the array
        reverse(array);

        // Printing the elements
        System.out.println(Arrays.toString(array));
    }

    public static void reverse(int[] array)
    {
        // Length of the array
        int n = array.length;

        // Swapping the first half elements 
        // With last Half Elements
        for (int i = 0; i < n / 2; i++) {

            // Storing the first half elements temporarily
            int temp = array[i];

            // Assigning the first half
              // to the last half
            array[i] = array[n - i - 1];

            // Assigning the last half
            // to the first half
            array[n - i - 1] = temp;
        }
    }
}
