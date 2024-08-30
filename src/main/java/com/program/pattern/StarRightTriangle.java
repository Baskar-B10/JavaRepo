package com.program.pattern;

public class StarRightTriangle {
    public static void StarRightTrianglePrint(int n)
    {
        int a, b;

        // outer loop to handle number of rows
        // k in this case
        for (a = 0; a < n; a++) {

            // inner loop to handle number of columns
            // values changing acc. to outer loop
            for (b = 0; b <= a; b++) {
                // printing stars
                System.out.print("* ");
            }

            // end-line
            System.out.println();
        }
    }

    public static void printRow(int n) // for printing a row
    {
        if(n == 0)
        {
            return;
        }
        System.out.print("* ");
        printRow(n - 1); // for next * in the current row
    }

    public static void changeRow(int n) // for moving to next row...n = 1 means last row
    {
        if(n == 0)
        {
            return;
        }
        changeRow(n - 1);
        printRow(n); // when call stack of changeRow method is popping out we will print row
        System.out.print("\n"); // new line after each column
    }


    // Driver Function
    public static void main(String args[])
    {
        int k = 5;
        StarRightTrianglePrint(k);
        changeRow(5);
    }
}
