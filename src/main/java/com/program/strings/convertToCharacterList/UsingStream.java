package com.program.strings.convertToCharacterList;// Java program to illustrate
// Converting a String to a List
// of Characters
import java.util.*;
import java.util.stream.Collectors;

// Java program to convert
// a String to a List of Characters

class UsingStream {

    // Function to convert String
    // to List of Characters
    public static List<Character>
    convertStringToCharList(String str)
    {

      // Create an empty List of character
      List<Character> chars = str

      // Convert to String to IntStream
      .chars()

      // Convert IntStream to Stream<Character>
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
        String str = "Geek";

        // Get the List of Character
        List<Character>
            chars = convertStringToCharList(str);

        // Print the list of characters
        System.out.println(chars);
    }
}
