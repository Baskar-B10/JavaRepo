package com.learnings.basics.regex;// Java Program Demonstrating Working of matches() Method
// Pattern class

import java.util.regex.Pattern;

class PatternDemo {
    public static void main(String args[]){

        // Following line prints "true" because the whole
        // text "geeksforgeeks" matches pattern
        // "geeks.*"
        System.out.println(Pattern.matches(
            "geeks.*", "geeksforgeeks"));

        // Following line prints "false" because the whole
        // text "geeks12s" doesn't match pattern "geeks[0-9]+"
        System.out.println(
            Pattern.matches("geeks[0-9]+", "geeks12s"));
    }
}