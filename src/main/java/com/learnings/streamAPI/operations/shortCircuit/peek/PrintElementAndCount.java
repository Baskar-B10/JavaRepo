package com.learnings.streamAPI.operations.shortCircuit.peek;// Java code to print the elements of StreamDemo

import java.util.stream.*; 

class PrintElementAndCount {
	public static void main(String[] args) 
	{ 

		// Get the stream 
		Stream<String> stream = Stream.of("Geeks", "For", 
										"Geeks", "A", 
										"Computer", "Portal"); 
stream.peek(s-> System.out.println(s)).findAny().orElse("NA");

		// Print the stream using peek() 
		// by providing a terminal operation count() 
		//stream.peek(s -> System.out.print(s)).count();
	} 
} 
