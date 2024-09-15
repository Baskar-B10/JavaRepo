package com.learnings.streamAPI.operations.streamBuilderOperations;// Java code to show the implementation
// of IntStream.Builder add(T t) 

import java.util.stream.IntStream; 

class IntStreamBuilderAdd {

	// Driver code 
	public static void main(String[] args) 
	{ 

		// Declaring an empty StreamDemo
		IntStream.Builder b = IntStream.builder(); 

		// using IntStream.Builder add(T t) 
		b.add(4); 
		b.add(5); 
		b.add(6); 
		b.add(7); 

		// Creating the StreamDemo
		// The stream has now entered the built phase 
		// printing the elements 
		System.out.println("StreamDemo successfully built");
		b.build().forEach(System.out::println); 

		// Trying to add another element into the stream 
		// Since the StreamDemo is in built phase
		// This operation is not possible now 
		// Hence add() will throw exception now 

		try { 
			b.add(50); 
		} 
		catch (Exception e) { 
			System.out.println("Exception thrown "
							+ "when now adding element into the stream: "
							+ e); 
		} 
	} 
} 
