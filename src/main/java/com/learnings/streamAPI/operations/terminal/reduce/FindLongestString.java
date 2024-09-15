package com.learnings.streamAPI.operations.terminal.reduce;// Implementation of reduce method
// to get the longest String
import java.util.*;

class FindLongestString {
    public static void main(String[] args) {
        // Creating a list of Strings
        List<String> words = Arrays.asList("FindLongestString", "Geeks", "for", "GeeksQuiz", "GeeksforGeeks");

        // Using reduce to find the longest string in the list
        Optional<String> longestString = words.stream()
            .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2);

        // Displaying the longest String
        longestString.ifPresent(System.out::println); 
    }
}
