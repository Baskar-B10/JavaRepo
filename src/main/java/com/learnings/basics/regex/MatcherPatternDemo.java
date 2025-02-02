package com.learnings.basics.regex;// Java code to illustrate pattern() method

import java.util.regex.*; 

public class MatcherPatternDemo {
	public static void main(String[] args) 
	{ 

		// Get the regex to be checked 
		String regex = "Geeks"; 

		// Create a pattern from regex 
		Pattern pattern 
			= Pattern.compile(regex); 

		// Get the String to be matched 
		String stringToBeMatched 
			= "GeeksForGeeks"; 

		// Create a matcher for the input String 
		Matcher matcher 
			= pattern.matcher(stringToBeMatched); 

		// Get the Pattern using pattern() method 
		System.out.println("Pattern: "
						+ matcher.pattern()); 
	} 
} 
