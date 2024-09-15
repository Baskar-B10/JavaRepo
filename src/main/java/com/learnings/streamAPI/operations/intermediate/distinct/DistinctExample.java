package com.learnings.streamAPI.operations.intermediate.distinct;

import java.util.Arrays;
import java.util.List;

public class DistinctExample {

    // Driver code
    public static void main(String[] args)
    {

        // Creating a list of integers
        List<Integer> list = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5);

        System.out.println("The distinct elements are :");

        // Displaying the distinct elements in the list
        // using StreamDemo.distinct() method
        list.stream().distinct().forEach(System.out::println);

        // Creating a list of strings
        List<String> listString = Arrays.asList("Geeks", "for", "Geeks",
                "GeeksQuiz", "for", "GeeksforGeeks");

        System.out.println("The distinct elements are :");

        // Displaying the distinct elements in the list
        // using StreamDemo.distinct() method
        listString.stream().distinct().forEach(System.out::println);
    }
}
