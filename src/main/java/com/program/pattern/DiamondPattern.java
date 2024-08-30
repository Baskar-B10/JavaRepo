package com.program.pattern;

public class DiamondPattern {

    public static void main(String[] args) {
        usingDoWhile(7);
        usingWhile(5);
        usingForLoop(6);

    }

    public static void usingDoWhile(int number )
    {
        // Declaring and initializing variables

        // Variable initialized to the row where max star
        // should be there as after that they decreases to
        // give diamond pattern


        // Diamond starting with single star in first row,so
        // initialized
        int m = 1;

        // Columnar printing
        int n;

        // Outer loop 1
        // Prints the first half diamond
        do {
            n = 1;

            // Inner loop 1
            // Prints space until ++n <= number - m + 1 is
            // false
            do {
                // Print whitespace between
                System.out.print(" ");

            }

            // Condition for inside do-while loop 1
            while (++n <= number - m + 1);

            // Now
            n = 1;

            // Inner loop 2
            // Prints star until ++n <= m * 2 - 1 is false

            do {

                // Print star
                System.out.print("*");
            }

            // Condition for inner do-while loop 2
            while (++n <= m * 2 - 1);

            // PublicMethods new row requires a new line
            System.out.println();

        }

        // Condition for outer do-while loop 1
        while (++m <= number);

        // Now we are done with printing the upper half
        // diamond.

        // Note: Not to print the bottom row again in lower
        // half diamond printing Hence variable to be
        // initialized should one lesser than number
        m = number - 1;

        // Outer loop 2
        // Prints the second half diamond
        do {
            n = 1;

            // Inner loop 1
            // Prints space until ++n <= number - m + 1 is
            // false
            do {
                // Print whitespace between
                System.out.print(" ");

            } while (++n <= number - m + 1);

            n = 1;

            // Inner loop 2
            // Prints star until ++n <= m * 2 - 1 is false
            do {
                // Prints star
                System.out.print("*");

            } while (++n <= m * 2 - 1);

            // By now done with one row of lower diamond
            // printing so a new line is required
            System.out.println();

        }

        // Condition for outer do-while loop 2
        while (--m > 0);
    }

    public static void usingWhile(int number )
    {

        // Declaring and initializing variables

        // Variable initialized to the row where max star
        // should be there as after that they decreases to
        // give diamond pattern


        // Diamond starting with single star in first row
        int m = 1;

        // Columnar printing
        int n;

        // Outer loop 1
        // Prints the first half diamond

        // Condition holding true till
        // number of rows initialized
        while (m <= number) {
            n = 1;

            // Inner loop 1
            // Prints space until n++ <= number - m is false
            while (n++ <= number - m) {

                // Print whitespaces inbetween
                System.out.print(" ");
            }

            n = 1;

            // Inner loop 2
            // Prints star until n++ <= m * 2 - 1 is false
            while (n++ <= m * 2 - 1) {

                // Print star
                System.out.print("*");
            }

            // By now we are done for above pyramid printing
            // ending line after each row
            System.out.println();

            // Incrementing as we want pyramid generation
            m++;
        }

        // Now we are done with printing the upper half
        // diamond.

        // Note: Not to print the bottom row again in lower
        // half diamond printing Hence variable t be
        // initialized should one lesser than number
        m = number - 1;

        // Outer loop 2
        // Prints the second half diamond
        while (m > 0) {
            n = 1;

            // Inner loop 1
            // Prints spaces until n++ <= number - m is
            // false
            while (n++ <= number - m) {

                // Print whitespace in between
                System.out.print(" ");
            }

            n = 1;

            // Inner loop 2
            // Prints star until n++ <= m * 2 - 1 is false
            while (n++ <= m * 2 - 1) {

                // Print star
                System.out.print("*");
            }

            // Ending line after each row
            System.out.println();

            // Decrementing as we want reverse pyramid
            // generation
            m--;
        }
    }

    public static void usingForLoop( int number)
    {

        // Declaring and initializing variables

        // Variable initialized to the row where max star
        // should be there as after that they decreases to
        // give diamond pattern


        int m, n;

        // Outer loop 1
        // prints the first half diamond
        for (m = 1; m <= number; m++) {

            // Inner loop 1 print whitespaces inbetween
            for (n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }

            // Inner loop 2 prints star
            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }

            // Ending line after each row
            System.out.println();
        }

        // Outer loop 2
        // Prints the second half diamond
        for (m = number - 1; m > 0; m--) {

            // Inner loop 1 print whitespaces inbetween
            for (n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }

            // Inner loop 2 print star
            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }

            // Ending line after each row
            System.out.println();
        }
    }
}
