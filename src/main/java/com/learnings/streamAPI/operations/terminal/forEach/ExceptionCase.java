package com.learnings.streamAPI.operations.terminal.forEach;// Java code to print the elements of StreamDemo

import java.util.stream.*; 

class ExceptionCase {
	public static void main(String[] args) 
	{ 

		// Get the stream 
		Stream<String> stream = Stream.of("Geeks", "For", 
										"Geeks", "A", 
										"Computer", "Portal"); 

		// Print the stream 
		stream.forEach(s -> System.out.println(s)); 

		// Since the stream has been already consumed 
		// this will throw exception 
		try { 

			// Print the stream 
			stream.forEach(s -> System.out.println(s)); 
		} 

		catch (Exception e) { 

			System.out.println("\nException: " + e); 
		} 
	} 
} 
