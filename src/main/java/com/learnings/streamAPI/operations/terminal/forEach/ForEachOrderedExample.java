package com.learnings.streamAPI.operations.terminal.forEach;// Java code for forEachOrdered
// (Consumer action) in Java 8 
import java.util.*; 

class ForEachOrderedExample {
	
	// Driver code 
	public static void main(String[] args) { 

	// Creating a list of Integers 
	List<Integer> list = Arrays.asList(10, 19, 20, 1, 2); 
	
	// Using forEachOrdered(Consumer action) to 
	// print the elements of stream in encounter order 
	list.stream().forEachOrdered(System.out::println);

		// Creating a list of Strings
		List<String> listString = Arrays.asList("OfNullableExample", "Geeks",
				"for", "GeeksforGeeks");

		// Using forEachOrdered(Consumer action) to
		// print the elements of stream in encounter order
		listString.stream().forEachOrdered(System.out::println);



	}
} 
