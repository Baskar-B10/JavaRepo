package com.program.pattern;

public class UpperStarTriangle {

    public static void main(String[] args)
    {

        // Declaring and initializing variable representing
        // number of rows to be printed
        int k = 9;

        // Nested 2 for loops for iterating over the matrix

        // Outer for loop for iterating over rows
        for (int a = 0; a <= k; a++) {

            // Inner for loop for iterating over columns
            // where we are printing white spaces
            for (int b = 1; b <= k - a; b++) {

                // Print the white space
                System.out.print(" ");
            }

            // Inner for loop for iterating over columns
            // where we are printing white spaces
            for (int l = 0; l <= a; l++) {

                // Print the star pattern
                System.out.print("*");
            }

            // By now we are done with one row so
            // next line
            System.out.println("");
        }
    }
}
