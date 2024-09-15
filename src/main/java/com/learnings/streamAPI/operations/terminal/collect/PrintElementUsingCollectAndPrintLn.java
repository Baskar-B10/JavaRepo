package com.learnings.streamAPI.operations.terminal.collect;// Java code to print the elements of StreamDemo

import java.util.stream.*; 

class PrintElementUsingCollectAndPrintLn {
	public static void main(String[] args) 
	{ 

		// Get the stream 
		Stream<String> stream = Stream.of("Geeks", "For", 
										"Geeks", "A", 
										"Computer", "Portal"); 

		// Print the stream 
		System.out.println(stream.collect(Collectors.toList())); 
	} 
} 
