package com.learnings.streamAPI.basics.streamCreation;// Java program to create StreamDemo from values

import java.util.stream.Stream;

class UsingStreamOf {

	// Function convert a List into StreamDemo
	private static void getStream() 
	{ 

		// Create a stream from specified values 
		Stream<Integer> stream 
			= Stream.of(1, 2, 
						3, 4, 
						5, 6, 
						7, 8, 
						9); 

		// Displaying the sequential ordered stream 
		stream.forEach(p -> System.out.print(p + " ")); 
	} 

	public static void main(String[] args) 
	{ 

		// Get the StreamDemo from the values
		getStream(); 
	} 
} 
