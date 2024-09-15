package com.learnings.streamAPI.operations.terminal.forEach;// Java code to print the elements of StreamDemo

import java.util.stream.*; 

class PrintUsingShortHandLambda {
	public static void main(String[] args) 
	{ 

		// Get the stream 
		Stream<String> stream = Stream.of("Geeks", "For", 
										"Geeks", "A", 
										"Computer", "Portal"); 

		// Print the stream 
		stream.forEach(System.out::println); 
	} 
} 
