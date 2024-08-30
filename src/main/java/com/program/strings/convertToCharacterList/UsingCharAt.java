package com.program.strings.convertToCharacterList;

import java.util.*;

// Java program to convert
// a String to a List of Characters

class UsingCharAt {

    // Function to convert String
    // to List of Characters
    public static List<Character>
    convertStringToCharList(String str)
    {
        return new AbstractList<Character>() {

            @Override
            public Character get(int index)
            {
                return str.charAt(index);
            }

            @Override
            public int size()
            {
                return str.length();
            }
        };
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
