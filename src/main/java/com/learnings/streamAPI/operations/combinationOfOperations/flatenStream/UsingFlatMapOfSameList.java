package com.learnings.streamAPI.operations.combinationOfOperations.flatenStream;// Java Program to flatten a stream of same type two arrays
// using flatMap() method

// Importing input output classes
// Importing Arrays and StreamDemo classes
// from java.util package
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// FindLastElementsUsingReverseSort class
class UsingFlatMapOfSameList {
  
    // Method 1
    //  To flatten a stream of two arrays of the same type
    public static <T> Stream<T> flatten(T[] a, T[] b)
    {
        // StreamDemo.flatMap() method converts
        // StreamDemo<Collection<T>> to the  StreamDemo<T>
        Stream<T> stream
            = Stream.of(a, b).flatMap(Arrays::stream);

        // Returns the desired stream
        return stream;
    }

    // Method 2
    // FindLastElementsUsingReverseSort driver method
    public static void main(String[] args)
    {
        // Input array of strings

        // Array 1 has uppercase characters
        String[] a = { "A", "B", "C" };

        // Array 2 has lowercase characters
        String[] b = { "i", "J", "K" };
         
        // Calling the above method in the main() method 
        String[] s = flatten(a, b).toArray(String[] ::new);

        // Return string representation of contents
        // of integer array
        System.out.println(Arrays.toString(s));
    }
}
