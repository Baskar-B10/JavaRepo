package com.learnings.streamAPI.operations.intermediate.filter;// Java Program to get a StreamDemo Consisting of the Elements
// of StreamDemo that Matches Given Predicate for StreamDemo filter
// (Predicate predicate)

// Importing required classes
import java.util.*;

// Class
class FilterNumberDivisibleBy5 {

    // SortByAscOrder driver method
    public static void main(String[] args)
    {

        // Creating a list of Integers
        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);

        // Getting a stream consisting of the
        // elements that are divisible by 5
        // Using StreamDemo filter(Predicate predicate)
        list.stream()
            .filter(num -> num % 5 == 0)
            .forEach(System.out::println);
    }
}
