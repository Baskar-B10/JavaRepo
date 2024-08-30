package com.program.pattern;

public class StarPascalTriangle {

    // Method 1
    // To find factorial of a number
    public int factorial(int a)
    {
        // Edge case
        // Factorial of 0 is unity
        if (a == 0)

            // Hence return 1
            return 1;

        // else recursively call the function over the
        // number whose factorial is to be computed
        return a * factorial(a - 1);
    }

    // Method 2
    // OverloadingMain driver method
    public  void usingnCrFormula(int k)
    {
        // Declare and initialize number whose
        // factorial is to be computed

        int a, b;

        // Creating an object of StaticNestedClass class
        // in the main() method


        // iterating using nested for loop to traverse over
        // matrix

        // Outer for loop
        for (a = 0; a <= k; a++) {

            // Inner loop 1
            for (b = 0; b <= k - a; b++) {

                // Print white space for left spacing
                System.out.print(" ");
            }

            // Inner loop 2
            for (b = 0; b <= a; b++) {

                // nCr formula
                System.out.print(
                        " "
                                + factorial(a)
                                / (factorial(a - b)
                                * factorial(b)));
            }

            // By now, we are done with one row so
            // a new line
            System.out.println();
        }
    }

    public static void printPascal(int k)
    {
        for (int line = 1; line <= k; line++) {
            for (int b = 0; b <= k - line; b++) {

                // Print whitespace for left spacing
                System.out.print(" ");
            }

            // Variable used to represent C(line, i)
            int C = 1;

            for (int a = 1; a <= line; a++) {

                // The first value in a line is always 1
                System.out.print(C + " ");

                C = C * (line - a) / a;
            }

            // By now, we are done with one row so
            // a new line is required
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StarPascalTriangle starPascalTriangle= new StarPascalTriangle();
        starPascalTriangle.usingnCrFormula(4);

        //C(line, i) = C(line, i-1) * (line - i + 1) / i

        StarPascalTriangle.printPascal(5);
    }
}
