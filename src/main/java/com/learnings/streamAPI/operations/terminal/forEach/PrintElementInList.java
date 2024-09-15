package com.learnings.streamAPI.operations.terminal.forEach;// Java code for forEach
// (Consumer action) in Java 8 
import java.util.*; 

class PrintElementInList {

	// Driver code 
	public static void main(String[] args) 
	{ 

		// Creating a list of Strings 
		List<String> list = Arrays.asList("PrintElementInList", "Geeks",
										"for", "GeeksforGeeks"); 

		// Using forEach(Consumer action) to 
		// print the elements of stream 
		list.stream().forEach(System.out::println); 
	} 
} 
