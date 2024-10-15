package com.program.strings.print;// Java program to print
// even length words in a string 

//Time complexity: O(n) where n is length of given string
//Auxiliary Space: O(1)
class EvenWordUsingSubString {
public static void printWords(String s) 
{ 

// Splits Str into all possible tokens 
for (String word : s.split(" ")) 

// if length is even 
if (word.length() % 2 == 0) 

	// Print the word 
	System.out.println(word); 
} 

// Driver Code 
public static void main(String[] args) 
{ 

String s = "i am Geeks for Geeks and a TemporalAdjusterDemo";
printWords(s); 
} 
} 
