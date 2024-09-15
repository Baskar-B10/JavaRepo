package com.learnings.streamAPI.basics.iterate;// Java program to iterate over StreamDemo with Indices

import java.util.stream.IntStream; 

class IterateWithIndicesUsingIntStream {
	public static void main(String[] args) 
	{ 

		String[] array = { "G", "e", "e", "k", "s" }; 

		// Iterate over the StreamDemo with indices
		IntStream 

			// Get the StreamDemo from the array
			.range(0, array.length) 

			// Map each elements of the stream 
			// with an index associated with it 
			.mapToObj(index -> String.format("%d -> %s", 
									index, array[index])) 

			// Print the elements with indices 
			.forEach(System.out::println); 
	} 
} 
