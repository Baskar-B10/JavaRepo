package com.program.strings.split;// Java Program to split a string into all possible
// substrings excluding the string with 0 characters i.e. "" 

import java.io.*; 
import java.util.ArrayList; 

class SubstringsOfAString { 
//Time Complexity: O(n2) where n is the length of  a string
	// function to split a string into all its substrings 
	// and return the list as an object of ArrayList 
	public static ArrayList<String> 
	splitSubstrings(String s) 
	{ 

		// variables to traverse through the 
		// string 
		int i, j; 

		// to store the length of the 
		// string 
		int stringLength = s.length(); 

		// List object to store the list of 
		// all substrings of the string s 
		ArrayList<String> subStringList 
			= new ArrayList<String>(); 

		// first for loop 
		for (i = 0; i < stringLength; i++) { 

			for (j = i + 1; j <= stringLength; j++) { 

				subStringList.add(s.substring(i, j)); 
			} 

		} // end of first for loop 

		// returning the list (object 
		// of ArrayList) of substrings 
		// of string s 
		return subStringList; 
	} 

	public static void main(String[] args) 
	{ 

		// here "The Cat" is our input string 
		String stringInput = new String("The Cat"); 

		ArrayList<String> subStringList 
			= SubstringsOfAString.splitSubstrings( 
				stringInput); 

		System.out.println( 
			"\nSubstring list printed as an ArrayList : "); 
		System.out.println(subStringList); 

		System.out.println( 
			"\n\nAll substrings printed 1 per line : "); 
		int count = 1; 

		// each substring would be printed 
		// within double quotes 
		for (String it : subStringList) { 
			System.out.println("(" + count + ") \"" + it 
							+ "\""); 
			count++; 
		} 
	} 
}
