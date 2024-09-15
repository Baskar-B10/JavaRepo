package com.learnings.streamAPI.operations.intermediate.filter;// Java Program to Get StreamDemo Consisting of Elements
// of StreamDemo that Matches Given Predicate
// for StreamDemo Filter (Predicate predicate)

// Importing required classes
import java.util.stream.Stream;

// Class
class Filter2CharacterUpperCase {

    // SortByAscOrder driver method
    public static void main(String[] args)
    {
        // Creating a stream of strings
        Stream<String> stream = Stream.of(
            "Geeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks");

        // Getting a stream consisting of the
        // elements having UpperCase Character
        // at custom index say be it '1'
        // using StreamDemo filter(Predicate predicate)
        stream
            .filter(
                str -> Character.isUpperCase(str.charAt(1)))
            .forEach(System.out::println);
    }
}
