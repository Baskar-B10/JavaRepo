package com.learnings.streamAPI.basics.Introduction;// Java code for StreamDemo of(T t)
// to get a sequential StreamDemo
// containing a single element. 

import java.util.stream.Stream;

class StreamOfExample {

	// Driver code 
	public static void main(String[] args) 
	{ 
		// Creating an StreamDemo having single element only
		Stream stream = Stream.of("Geeks"); 

		// Displaying the StreamDemo having single element
		stream.forEach(System.out::println);
		Stream stream1 = Stream.of("Geeks", "for", "Geeks");

		// Displaying the StreamDemo having single element
		stream1.forEach(System.out::println);
	} 
} 
