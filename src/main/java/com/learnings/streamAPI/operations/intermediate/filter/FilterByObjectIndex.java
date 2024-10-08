package com.learnings.streamAPI.operations.intermediate.filter;// Java program to demonstrate
// filter by Object Indices 
// using AtomicInteger 

import java.io.*; 
import java.util.stream.Stream; 
import java.util.concurrent.atomic.AtomicInteger; 

class FilterByObjectIndex { 

	public static void filterByIndexUsingAtomic() 
	{ 
		// create a string array 
		String[] myArray 
			= new String[] { "stream", "is", "a", 
							"sequence", "of", "elements", 
							"like",	 "list" }; 

		// create a stream on myArray 
		Stream<String> myStream = Stream.of(myArray); 

		// create an AtomicInteger 
		AtomicInteger i = new AtomicInteger(0);

		// increment the i value by 1 everytime 
		// if it is even, print the current element 
		myStream.filter(x -> i.getAndIncrement() % 2 == 0) 
			.forEach(System.out::println); 
	} 

	public static void main(String[] args) 
	{ 
		// filter by Object index 
		filterByIndexUsingAtomic(); 
	} 
}
