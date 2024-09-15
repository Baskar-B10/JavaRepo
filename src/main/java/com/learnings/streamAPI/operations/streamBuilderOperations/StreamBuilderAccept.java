package com.learnings.streamAPI.operations.streamBuilderOperations;// Java code to show the implementation
// of StreamDemo.Builder accept(T t)

import java.util.stream.Stream; 

class StreamBuilderAccept {

	// Driver code 
	public static void main(String[] args) 
	{ 

		// Declaring an empty StreamDemo
		Stream.Builder<String> str_b = Stream.builder(); 

		// Inserting elements into the stream 
		// using StreamDemo.Builder accept(T t)
		str_b.accept("Geeks"); 
		str_b.accept("for"); 
		str_b.accept("GeeksforGeeks"); 
		str_b.accept("Data Structures"); 
		str_b.accept("Geeks Classes"); 

		// Creating the String StreamDemo
		// The stream has now entered the built phase 
		Stream<String> s = str_b.build(); 

		// printing the elements 
		System.out.println("StreamDemo successfully built");
		s.forEach(System.out::println);

		try {
			str_b.accept("asv");
		}
		catch (Exception e) {
			System.out.println("Exception thrown "
					+ "when now adding element into the stream: "
					+ e);
		}
	} 
} 
