package com.learnings.streamAPI.operations.terminal.collect;// Java code to print the elements of StreamDemo

import java.util.stream.*; 

class ExceptionCase {
	public static void main(String[] args) 
	{ 

		// Get the stream 
		Stream<String> stream = Stream.of("Geeks", "For", 
										"Geeks", "A", 
										"Computer", "Portal"); 

		// Print the stream 
		System.out.println(stream.collect(Collectors.toList())); 

		// Since the stream has been already consumed 
		// this will throw exception 
		try { 

			// Print the stream 
			System.out.println(stream.collect(Collectors.toList())); 
		} 

		catch (Exception e) { 

			System.out.println("\nException: " + e); 
		} 
	} 
} 
