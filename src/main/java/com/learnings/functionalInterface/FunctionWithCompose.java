package com.learnings.functionalInterface;// Java Program to illustrate compose() method

// Importing Function interface
import java.util.function.Function;

// SupplierWithGet class
public class FunctionWithCompose {

    // SupplierWithGet driver method
    public static void main(String args[])
    {
        // Function which takes in a number and
        // returns half of it
        Function<Integer, Double> half = a -> a / 2.0;

        // Triple the value given to half function
        half = half.compose(a -> 3 * a);

        // Applying the function to get the result
        System.out.println(half.apply(5));
    }
}
