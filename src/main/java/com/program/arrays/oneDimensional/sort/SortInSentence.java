package com.program.arrays.oneDimensional.sort;// Java program to sort an array of strings
// in ascending and descending alphabetical order
// Using Arrays.sort()

// Importing arrays and Collections class
// from java.util class
import java.util.Arrays;
import java.util.Collections;

// DateWithDifferentLocale class
public class SortInSentence {
//caps first then small case in asc
    // DateWithDifferentLocale driver method
    //Time Complexity: O(nlog(n)) as it complexity of arrays.sort()
//Auxiliary Space : O(1)
    public static void main(String[] args)
    {
        // Custom input string
        String arr[] = { "practice",
                         "makes",
                         "perfect",
            "Get","Ready"
        };

        // Sorts arr[] in ascending order
        Arrays.sort(arr);
        System.out.println("Modified arr[] : "
                           + Arrays.toString(arr));

        // Sorts arr[] in descending order
        Arrays.sort(arr, Collections.reverseOrder());

        // Lastly printing the above array
        System.out.println("Modified arr[] :"
                           + Arrays.toString(arr));
    }
}
