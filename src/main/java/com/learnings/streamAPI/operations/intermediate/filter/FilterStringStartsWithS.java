package com.learnings.streamAPI.operations.intermediate.filter;// Java Program to Get a StreamDemo Consisting ofElements
//  of StreamDemo that Matches Given predicate
// for StreamDemo filter (Predicate predicate)

// Importing required classes
import java.util.stream.Stream;

// Class
class FilterStringStartsWithS {

    // SortByAscOrder driver method
    public static void main(String[] args)
    {

        // Creating a stream of strings
        Stream<String> stream = Stream.of(
            "Geeks", "foR", "GeEksQuiz", "GeeksforGeeks");

        // Getting a stream consisting of the
        // elements ending with 's'
        // using StreamDemo filter(Predicate predicate)
        stream.filter(str -> str.endsWith("s"))
            .forEach(System.out::println);
    }
}
