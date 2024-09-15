package com.learnings.streamAPI.basics.streamCreation;// Java program to create infinite StreamDemo
// using StreamDemo.generate() method

import java.util.stream.*;

class UsingStreamGenerator {

	// Function convert a List into StreamDemo
	private static <T> void getStream(int limitTerms) 
	{ 

		// Create infinite stream 
		// using StreamDemo.generate() method
		Stream.generate(Math::random) 
			.limit(5)
			.forEach(System.out::println); 
	} 

	public static void main(String[] args) 
	{ 

		// Get the limit for number of terms 
		int limitTerms = 5; 

		// Get the StreamDemo from the function
		getStream(limitTerms); 
	} 
} 
