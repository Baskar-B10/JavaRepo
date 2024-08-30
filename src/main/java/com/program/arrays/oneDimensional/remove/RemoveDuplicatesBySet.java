package com.program.arrays.oneDimensional.remove;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesBySet {

    //Time Complexity: O(n)
    //Auxiliary Space: O(n)
    // Function to remove duplicates from the array and return the count of unique elements
    static int removeDuplicates(int[] arr, int n) {
        if (n <= 1)
            return n;

        // Use a Set to store unique elements
        Set<Integer> uniqueElements = new HashSet<>();

        // Traverse the array and add elements to the Set
        for (int i = 0; i < n; ++i) {
            uniqueElements.add(arr[i]);
        }

        int index = 0;
        // Iterate through unique elements and update the original array
        for (int element : uniqueElements) {
            arr[index++] = element;
        }

        // Return the count of unique elements
        return uniqueElements.size();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int n = arr.length;

        // Remove duplicates and get the count of unique elements
        n = removeDuplicates(arr, n);

        // Print the modified array containing unique elements
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
