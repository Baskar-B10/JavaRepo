package com.learnings.streamAPI.operations.combinationOfOperations.reverseElements;// Java program to reverse elements
// of a parallel StreamDemo

import java.util.*; 
import java.util.stream.*; 

class UsingCollectorOfAndArrayDeque {

	// Generic function to reverse 
	// the elements of the parallel stream 
	public static <T> Stream<T> reverseStream(Stream<T> stream) 
	{ 
		return stream 
			.collect( 
				Collector.of( 
					() -> new ArrayDeque<T>(), ArrayDeque::addFirst, (a, b) -> { 
						b.addAll(a); 
						return b; 
					})) 
			.stream(); 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 

		// Get the parallel stream 
		List<Integer> lists = Arrays.asList(11, 22, 33, 44); 
		Stream<Integer> stream = lists.parallelStream(); 

		// Reverse and print the elements 
		reverseStream(stream) 
			.forEach(System.out::println); 
	} 
} 
