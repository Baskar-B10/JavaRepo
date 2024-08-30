package com.program.pattern;

public class DownwardTriangle {

    public static void main(String[] args) {
        usingForLoop(9);
        nextRow(8);
    }
    public static void usingForLoop(int rows)
    {
        // Nested 2 for loops for iteration over the matrix

        // Outer loop for rows

        for (int a = rows - 1; a >= 0; a--) {

            // Inner loop for columns
            for (int b = 0; b <= a; b++) {

                // Prints star and space
                System.out.print("*"
                        + " ");
            }

            // By now we are done with single row so new
            // line
            System.out.println();
        }
    }

    public static void printRow(int n)
    {
        if(n == 0) // base case
        {
            return;
        }

        System.out.print("* ");
        printRow(n - 1); // next * in the same row
    }
    public static void nextRow(int n)
    {
        if(n == 0)
        {
            return;
        }
        printRow(n); // prints the whole row recursively.
        System.out.print("\n"); // for new line after printing a row...
        nextRow(n - 1);     // changed to new row
    }
}
