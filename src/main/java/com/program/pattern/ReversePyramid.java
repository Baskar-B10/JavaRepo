package com.program.pattern;

public class ReversePyramid {
    public static void main(String[] args) {
        usingWhileLoop(7);
        usingForLoop(7);
        usingDoWhile(7);
    }

    public static void usingWhileLoop( int number)
    {
        // Declaring and initializing variable to
        // Size of the pyramid


        int i = number, j;

        // Nested while loops
        // Outer loop

        // Till condition holds true
        while (i > 0) {
            j = 0;

            // Inner loop
            // Condition check
            while (j++ < number - i) {
                // Print whitespaces
                System.out.print(" ");
            }

            j = 0;

            // Inner loop
            // Condition check
            while (j++ < (i * 2) - 1) {
                // Print star
                System.out.print("*");
            }

            // By now, we reach end of execution for one row
            // so next line
            System.out.println();

            // Decrementing counter because we want to print
            // reverse of pyramid
            i--;
        }
    }

    public static void usingForLoop( int number){
        // Size of the pyramid

        int i, j;

        // Outer loop handle the number of rows
        for(i = number; i >= 1; i--)
        {

            // Inner loop print space
            for(j = i; j < number; j++)
            {
                System.out.print(" ");
            }

            // Inner loop print star
            for(j = 1; j <= (2 * i - 1); j++)
            {
                System.out.print("*");
            }

            // Ending line after each row
            System.out.println("");
        }
    }

    public static void usingDoWhile(int number)
    {
        // Declare and initialize variable to
        // Size of the pyramid


        int i = number, j;

        // Outer loop iterate until i > 0 is false
        do {
            j = 0;

            // First inner do-while loop
            do {

                // Prints space until j++ < number - i is
                // false
                System.out.print(" ");
            } while (j++ < number - i);
            j = 0;

            // Second inner do-while loop

            // Inner loop prints star
            // until j++ < i * 2 - 2 is false
            do {

                // print star
                System.out.print("*");
            }

            while (j++ < i * 2 - 2);

            // Print whitespace
            System.out.println("");
        }

        // while of outer 'do-while' loop
        while (--i > 0);
    }

}
