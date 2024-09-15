package com.learnings.streamAPI.basics.streamCreation;// Java program to create infinite StreamDemo
// using StreamDemo.iterate() method

import java.util.stream.Stream;

class UsingStreamIterator {

	// Function convert a List into StreamDemo
	private static <T> void
	getStream(int seedValue, int limitTerms) 
	{ 

		// Create infinite stream 
		// using StreamDemo.iterate() method
		Stream.iterate(seedValue, integer -> integer*integer)
			.limit(limitTerms) 
			.forEach(System.out::println); 
	} 

	public static void main(String[] args) 
	{ 

		// Get the seed value 
		int seedValue = 2; 

		// Get the limit for number of terms 
		int limitTerms = 5; 

		// Get the StreamDemo from the function
		getStream(seedValue, limitTerms); 
	} 
} 
