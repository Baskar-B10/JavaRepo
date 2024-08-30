package com.program.pattern;

public class StarleftTriangle {
    public static void StarleftTrianglePrint(int k)
    {
        int a, b;

        // 1st loop
        for (a = 0; a < k; a++) {

            // nested 2nd loop
            for (b = 2 * (k - a); b >= 0; b--) {
                // printing spaces
                System.out.print(" ");
            }

            // nested 3rd loop
            for (b = 0; b <= a; b++) {
                // printing stars
                System.out.print("* ");
            }

            // end-line
            System.out.println();
        }
    }

    // similar to inner for loop
    public static void printRow(int n, int totalRows)
    {
        if(totalRows == 0)
        {
            return;
        }

        if(totalRows <= n) // condition when to print star
        {
            System.out.print(" *");
        }
        else // condition when to print space
        {
            System.out.print("  ");
        }
        printRow(n, totalRows - 1); // moving to next column recursively
    }

    // similar to outer for loop
    public static void newRow(int n, int totalRows)
    {
        if(n == 0)
        {
            return;
        }

        newRow(n - 1, totalRows);
        printRow(n, totalRows); // prints stars and space in a single row
        System.out.print("\n"); // for new Row.....new line
    }

    // Driver Function
    public static void main(String args[])
    {
        int k = 5;
        StarleftTrianglePrint(k);
        newRow(5, 5);
    }
}
