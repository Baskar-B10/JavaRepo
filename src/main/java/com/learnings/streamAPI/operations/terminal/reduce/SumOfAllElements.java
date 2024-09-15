package com.learnings.streamAPI.operations.terminal.reduce;// Implementation of reduce method
// to get the sum of all elements
import java.util.*;

class SumOfAllElements {
    public static void main(String[] args) {
        // Creating list of integers
        List<Integer> numbers = Arrays.asList(-2, 0, 4, 6, 8);

        // Using reduce to find the sum of all elements
        int sum = numbers.stream()
            .reduce(0, (element1, element2) -> element1 + element2);

        // Displaying the sum of all elements
        System.out.println("The sum of all elements is " + sum); 
    }
}
