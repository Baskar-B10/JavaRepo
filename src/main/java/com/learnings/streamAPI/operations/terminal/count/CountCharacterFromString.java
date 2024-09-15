package com.learnings.streamAPI.operations.terminal.count;// Java program to count occurrences
// of a character using StreamDemo

class CountCharacterFromString {

	// Method that returns the count of the given 
	// character in the string 
	public static long count(String s, char ch) 
	{ 

		return s.chars() 
			.filter(c -> c == ch) 
			.count(); 
	} 

	// Driver method 
	public static void main(String args[]) 
	{ 
		String str = "geeksforgeeks"; 
		char c = 'e'; 
		System.out.println(count(str, c)); 
	} 
} 
