package com.program.strings.sort;// Java program to Sort a String Alphabetically
// Using toCharArray() method
// With using the sort() method

// Importing Arrays class from java.util package
import java.util.Arrays;

// DateWithDifferentLocale class
public class SortStringBySortMethod {
    // Method 1
    // To sort a string alphabetically
    public static String sortString(String inputString)
    {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();

        // Sorting temp array using
        Arrays.sort(tempArray);

        // Returning new sorted string
        return new String(tempArray);
    }

    // Method 2
    // DateWithDifferentLocale driver method
    public static void main(String[] args)
    {
        // Custom string as input
        String inputString = "geeksforgeeks";
        String outputString = sortString(inputString);

        // Print and display commands

        // Input string
        System.out.println("Input String : " + inputString);
        // Output string
        System.out.println("Output String : "
                           + outputString);
    }
}
