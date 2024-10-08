package com.learnings.functionalInterface;// Java Program to Illustrate identity() method

// Importing Function interface
import java.util.function.Function;

// SupplierWithGet class
public class FunctionWithIdentify {

    // SupplierWithGet driver method
    public static void main(String args[])
    {
        // Function which takes in a number and
        // returns it
        Function<Integer, Integer> i = Function.identity();

        // Print statement
        System.out.println(i.apply(10));
    }
}
