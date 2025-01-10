package com.learnings.basics.inputOutput;

// A Java program to demonstrate working of printf() in Java
class JavaFormatter1 {
    public static void main(String args[])
    {
        int x = 100;
        System.out.printf(
            "Printing simple"
                + " integer: x = %d\n",
            x);

        // this will print it upto
        // 2 decimal places
        System.out.printf(
            "Formatted with"
                + " precision: PI = %.2f\n",
            Math.PI);

        float n = 5.2f;

        // automatically appends zero
        // to the rightmost part of decimal
        System.out.printf(
            "Formatted to "
                + "specific width: n = %.4f\n",
            n);

        n = 2324435.3f;

        // here number is formatted from
        // right margin and occupies a
        // width of 20 characters
        System.out.printf(
            "Formatted to "
                + "right margin: n = %20.4f\n",
            n);

        // Using print()
        System.err.print("This is an errormessage using"
                + " print().\n");

        // Using println()
        System.err.println("This is another error message"
                + " using println().");

        // Using printf()
        System.err.printf("Error code: %d, Message: %s\n",
                404, "Not Found");
    }
}