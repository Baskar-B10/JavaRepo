package com.learnings.streamAPI.operations.combinationOfOperations.findDuplicates;// Java program to find the duplicate
// elements in a StreamDemo using Collectors.groupingBy()

import java.util.*; 
import java.util.stream.*; 
import java.util.function.Function; 

public class UsingCollectorGroupBy {

	// Function to find the 
	// duplicates in a StreamDemo
	public static <T> Set<T> 
	findDuplicateInStream(Stream<T> stream) 
	{ 

		// Return the set of duplicate elements 
		return stream 

			// Group the elements along 
			// with their frequency in a map 
			.collect( 
				Collectors.groupingBy( 
					Function.identity(), 
					Collectors.counting())) 

			// Convert this map into a stream 
			.entrySet() 
			.stream() 

			// Check if frequency > 1 
			// for duplicate elements 
			.filter(m -> m.getValue() > 1) 

			// Find such elements 
			.map(Map.Entry::getKey) 

			// And Collect them in a Set 
			.collect(Collectors.toSet()); 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 

		// Initial stream 
		Stream<Integer> stream 
			= Stream.of(5, 13, 4, 
						21, 13, 27, 
						2, 59, 59, 34); 

		// Print the found duplicate elements 
		System.out.println( 
			findDuplicateInStream(stream)); 
	} 
} 
