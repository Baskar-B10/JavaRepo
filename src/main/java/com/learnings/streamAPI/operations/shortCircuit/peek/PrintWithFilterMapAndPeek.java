package com.learnings.streamAPI.operations.shortCircuit.peek;// Java code to print the elements of StreamDemo

import java.util.stream.*; 

class PrintWithFilterMapAndPeek {
	public static void main(String[] args) 
	{ 

		// Get the stream 
		Stream<String> stream = Stream.of("Geeks", "For", "GeeksForGeeks", "A",
										"Computer", "Portal"); 

		// Since the stream is not being consumed 
		// this will not throw any exception 

		// Print the stream 
		stream.filter(s -> s.startsWith("G")) 
			.peek(s -> System.out.println("Filtered value: " + s)) 
			.map(String::toUpperCase) 
			.peek(s -> System.out.println("Uppercase value :" + s)) 
			.count();


	} 
} 
