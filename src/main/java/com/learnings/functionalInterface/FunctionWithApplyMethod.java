package com.learnings.functionalInterface;// Java Program to Illustrate Functional Interface
// Via apply() method

// Importing interface
import java.util.function.Function;

// SupplierWithGet class
public class FunctionWithApplyMethod {

    // SupplierWithGet driver method
    public static void main(String args[])
    {
        // Function which takes in a number
        // and returns half of it
        Function<Integer, Double> half = a -> a / 2.0;

        // Applying the function to get the result
        System.out.println(half.apply(10));
    }
}
