package com.learnings.functionalInterface;// Java Program to illustrate addThen() method
// When NullPointerException occurs

// Importing interface
import java.util.function.Function;

// SupplierWithGet class
public class FunctionWithAndThenNPE {

    // SupplierWithGet driver method
    public static void main(String args[])
    {

        // Function which takes in a number and
        // returns half of it
        Function<Integer, Double> half = a -> a / 2.0;

        // Try block to check for exceptions
        try {

            // Trying to pass null as parameter
            half = half.andThen(null);
        }

        // Catch block to handle exceptions
        catch (Exception e) {

            // Print statement
            System.out.println("Exception thrown "
                               + "while passing null: "
                               + e);
        }
    }
}
