package com.program.arrays.oneDimensional.sort;

import java.util.Arrays;

class SortByAsc {
    //Time Complexity: O(nlog(n)) as it complexity of arrays.sort()
    //Auxiliary Space : O(1)
    public static void main(String args[])
    {
        int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
        System.out.println("The original array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nThe sorted array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // Printing the array after sorting
        System.out.println("Modified arr[] : "
                + Arrays.toString(arr));

    }
}
