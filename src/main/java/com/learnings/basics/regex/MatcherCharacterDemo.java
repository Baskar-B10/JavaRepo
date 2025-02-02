package com.learnings.basics.regex;// Java Program to check on Regex
import java.util.regex.*;

// Driver class
class MatcherCharacterDemo {
    // Main function
    public static void main(String[] args)
    {
        // Checks if the string matches with the regex
        // Should be single character a to z
        System.out.println(Pattern.matches("[a-z]",
                                           "g"));

        // Check if the element is range a to z or A to Z
        System.out.println(Pattern.matches("[a-zA-Z]",
                                           "Gfg"));

        // Checking all the strings using regex
        System.out.println(Pattern.matches("[b-z]?",
                "a"));

        // Check if all the elements are in range a to z
        // or A to Z
        System.out.println(Pattern.matches("[a-zA-Z]+",
                "GfgTestCase"));

        // Check if elements is not in range a to z
        System.out.println(Pattern.matches("[^a-z]?",
                "g"));

        // Check if all the elements are either g,e,k or s
        System.out.println(Pattern.matches("[geks]*",
                "geeksgeeks"));

        // Check if all elements are numbers
        System.out.println(Pattern.matches("\\d+", "1234"));

        // Check if all elements are non-numbers
        System.out.println(Pattern.matches("\\D+", "1234"));

        // Check if all the elements are non-numbers
        System.out.println(Pattern.matches("\\D+", "Gfg"));

        // Check if all the elements are non-spaces
        System.out.println(Pattern.matches("\\S+", "gfg"));
    }
}