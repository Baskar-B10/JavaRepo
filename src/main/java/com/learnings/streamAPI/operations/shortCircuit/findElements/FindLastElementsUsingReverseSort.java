package com.learnings.streamAPI.operations.shortCircuit.findElements;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindLastElementsUsingReverseSort {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);        
        // Get the first element of the reversed stream
        Integer firstElementOfReversedStream = numbers.stream()
                .sorted(Collections.reverseOrder())
                .findFirst()
                .orElse(null); 
      // Handle the case where the stream might be empty        
        System.out.println("First element of the reversed stream: " + firstElementOfReversedStream);
    }
}
