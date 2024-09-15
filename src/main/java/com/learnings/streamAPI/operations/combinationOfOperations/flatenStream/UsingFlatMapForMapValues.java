package com.learnings.streamAPI.operations.combinationOfOperations.flatenStream;// Java Program to Flatten a map containing a list of items
// as values using flatMap() method

// Importing input output classes
// Importing desired classes from java.util package
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// FindLastElementsUsingReverseSort class
public class UsingFlatMapForMapValues {

    // Method 1
    // To flatten a map containing a list of items as values
    public static <T> Stream<T>
    flatten(Collection<List<T> > values)
    {

        // StreamDemo.flatMap() method converts
        // StreamDemo<Collection<T>> to the  StreamDemo<T>
        Stream<T> stream
            = values.stream().flatMap(x -> x.stream());

        // Return the desired stream
        return stream;
    }

    // Method 2
    // FindLastElementsUsingReverseSort driver method
    public static void main(String[] args)
    {

        // Creating an object of Map class
        // Declaring object of integer and string type
        Map<Integer, List<String> > map = new HashMap<>();

        // Adding elements to the above Map object
        // Custom input entries
        map.put(1, Arrays.asList("1", "2", "3"));
        map.put(2, Arrays.asList("4", "5", "6"));

        // Creating a List class object holding all elements
        // after flattening
        List<String> s = flatten(map.values())
                             .collect(Collectors.toList());

        // Print and display the above List object
        System.out.println(s);
    }
}
