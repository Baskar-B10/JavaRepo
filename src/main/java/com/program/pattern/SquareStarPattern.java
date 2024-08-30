package com.program.pattern;

public class SquareStarPattern {

    public static void main(String args[])
    {
        // Declaring and initializing rows and columns
        // For square row = columns

        // Custom input initialization values
        int rows = 8, columns = 22;

        // Calling the method1 to print hollow rectangle
        // pattern
        print_rectangle(rows, columns);

        int length = 12;

        // calling the method1 to print
        // square pattern with diagonal
        print_squaredi(length);
    }

    static void print_rectangle(int k, int l)
    {
        int a, b;

        // Nested for loops for iterations

        // Outer loop for rows
        for (a = 1; a <= k; a++) {
            // Inner loop for columns
            for (b = 1; b <= l; b++) {
                // Condition check using logical OR operator
                // over rows and columns positions
                // if found at circumference of rectangle
                if (a == 1 || a == k || b == 1 || b == l)

                    // Print the star pattern
                    System.out.print("*");
                else

                    // Rest inside square print the empty
                    // spaces
                    System.out.print(" ");
            }

            // By now we are done with only 1 row so
            // New line
            System.out.println();
        }
    }

    static void print_squaredi(int k)
    {
        int a, b;

        // Nested 2 for loops for Matrix printing

        // Outer loop for rows
        for (a = 1; a <= k; a++) {
            // Inner loop for columns
            for (b = 1; b <= k; b++) {
                // Condition check using OR operator where
                // 1. Printing star as per first 4 checks
                // on the circumference of rectangle
                // 2. Fifth check is for diagonals
                if (a == 1 || a == k || b == 1 || b == k
                        || a == b || b == (k - a + 1))

                    // Print the star pattern
                    System.out.print("*");
                else

                    // Print the white spaces
                    System.out.print(" ");
            }

            // By now we are over with one row so
            // new line
            System.out.println();
        }
    }
}
