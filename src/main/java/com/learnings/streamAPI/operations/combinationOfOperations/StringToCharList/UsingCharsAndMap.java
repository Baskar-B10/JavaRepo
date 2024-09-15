package com.learnings.streamAPI.operations.combinationOfOperations.StringToCharList;// Java program to illustrate
// Converting a String to a List
// of Characters
import java.util.*;
import java.util.stream.Collectors;

// Java program to convert
// a String to a List of Characters

class UsingCharsAndMap {

    // Function to convert String
    // to List of Characters
    public static List<Character>
    convertStringToCharList(String str)
    {

      // Create an empty List of character
      List<Character> chars = str

      // Convert to String to IntStream
      .chars()

      // Convert IntStream to StreamDemo<Character>
      .mapToObj(e -> (char)e)

      // Collect the elements as a List Of Characters
      .collect(Collectors.toList());

      // return the List
      return chars;
    }

    // Driver code
    public static void main(String[] args)
    {

        // Get the String to be converted
        String str = "TemporalAdjusterDemo";

        // Get the List of Character
        List<Character>
            chars = convertStringToCharList(str);

        // Print the list of characters
        System.out.println(chars);
    }
}
