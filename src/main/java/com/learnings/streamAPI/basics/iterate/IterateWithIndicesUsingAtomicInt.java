package com.learnings.streamAPI.basics.iterate;// Java program to iterate over StreamDemo with Indices

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger; 

class IterateWithIndicesUsingAtomicInt {
	public static void main(String[] args) 
	{ 

		String[] array = { "G", "e", "e", "k", "s" }; 

		// Create an AtomicInteger for index 
		AtomicInteger index = new AtomicInteger(); 

		// Iterate over the StreamDemo with indices
		Arrays 

			// Get the StreamDemo from the array
			.stream(array) 

			// Map each elements of the stream 
			// with an index associated with it 
			.map(str -> index.getAndIncrement() + " -> " + str) 

			// Print the elements with indices 
			.forEach(System.out::println); 
	} 
} 
