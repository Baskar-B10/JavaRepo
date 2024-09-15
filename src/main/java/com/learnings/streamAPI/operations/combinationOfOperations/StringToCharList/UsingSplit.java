package com.learnings.streamAPI.operations.combinationOfOperations.StringToCharList;/*package whatever //do not write package name here */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class UsingSplit {
    
    // Function to convert String to List of Characters using split()
    public static List<Character> convertStringToCharList(String str) {
        return Arrays.stream(str.split(""))
                     .map(s -> s.charAt(0))
                     .collect(Collectors.toList());
    }

    // Driver code
    public static void main(String[] args) {
      
        // Get the String to be converted
        String str = "TemporalAdjusterDemo";
        
        // Get the List of Character
        List<Character> chars = convertStringToCharList(str);
        
        // Print the list of characters
        System.out.println(chars);
    }
}
