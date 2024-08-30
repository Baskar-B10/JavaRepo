package com.program.pattern;

public class MirrorLowerStartTriangle {

    public static void main(String[] args) {
        usingForLoop(7);
        usingWhile(2);
        usingDoWhile(5);
    }

    public static void usingForLoop(int number)
    {
        // Declare and initialize variable to
        // Size of the triangle


        // Declaring two variables for rows and columns
        int m, n;

        // Outer loop 1
        // Prints the first half triangle
        for (m = 1; m <= number; m++) {

            // Inner loop 1
            for (n = 1; n < m; n++) {
                // Print whitespace
                System.out.print(" ");
            }

            // Inner loop 2
            for (n = m; n <= number; n++) {
                // Print star
                System.out.print("*"
                        + " ");
            }

            // Ending line after each row
            System.out.println();
        }

        // Outer loop 2
        // prints the second half triangle
        for (m = number - 1; m >= 0; m--) {

            // Inner loop 1
            for (n = 0; n < m; n++) {
                // Print whitespace
                System.out.print(" ");
            }

            // Inner loop 2
            for (n = m; n <= number - 1; n++) {
                // Print star
                System.out.print("*"
                        + " ");
            }

            // Ending line after each row
            System.out.println();
        }
    }

    public static void usingWhile(int number)
    {
        // Declare and initialize variable to
        // Size of the triangle

        int m = number;
        int n;

        // Outer loop 1
        // prints the first half triangle

        // Till condition holds true
        while (m > 0) {
            n = 0;

            // Inner loop 1
            // prints space until n++ < number - m is false
            while (n++ < number - m) {
                // print whitespace
                System.out.print(" ");
            }

            n = 0;

            // Inner loop 2
            // Prints star until n++ < (m * 2) - 1 is false
            while (n++ < (m * 2) - 1) {
                // Print star
                System.out.print("*");
            }

            // Ending line after each row
            System.out.println();

            // Decrementing by one
            m--;
        }

        m = 1;

        // Outer loop 2
        // prints the second half triangle
        while (m <= number) {
            n = 0;

            // Inner loop 1
            // prints space until n++ < number - m is false
            while (n++ < number - m) {
                // Print whitespace
                System.out.print(" ");
            }

            n = 0;

            // Inner loop 2
            // Prints star until n++ < (m * 2) - 1 is false
            while (n++ < (m * 2) - 1) {
                // print star
                System.out.print("*");
            }

            // Ending line after each row
            System.out.println();

            m++;
        }
    }

    public static void usingDoWhile(int number)
    {
        // Declare variable with the
        // Size of the triangle


        int m = number;
        int n;

        // Outer loop 1
        // prints the first half triangle
        do {
            n = 0;

            // Inner loop 1
            // prints space until n++ < number - m is false
            do {
                // Print whitespaces
                System.out.print(" ");

            } while (n++ < number - m);

            n = 0;

            // Inner loop 2
            // prints star until n++ < m * 2 - 2 is false
            do {
                // Print star
                System.out.print("*");
            }

            while (n++ < m * 2 - 2);

            System.out.println("");

        }

        // Condition check for do-while
        while (--m > 0);

        m = 1;

        // Outer loop 2
        // prints the second half triangle
        do {
            n = 0;

            // Inner loop 1
            // prints space until n++ < (number - m) is
            // false
            do {
                // Print whitespace
                System.out.print(" ");

            } while (n++ < (number - m));

            n = 0;

            // Inner loop 2
            // prints star until n++ < (m * 2) - 2 is false
            do {
                // Print star
                System.out.print("*");
            }

            while (n++ < (m * 2) - 2);

            System.out.println("");

        }

        // Condition check for do-while
        while (++m <= number);
    }
}
