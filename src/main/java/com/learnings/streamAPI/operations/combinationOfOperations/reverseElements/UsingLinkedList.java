package com.learnings.streamAPI.operations.combinationOfOperations.reverseElements;// Java program to reverse elements
// of a parallel StreamDemo

import java.util.*; 
import java.util.stream.*; 

class UsingLinkedList {

	// Generic function to reverse 
	// the elements of the parallel stream 
	public static <T> Iterator<T> reverseStream(Stream<T> stream) 
	{ 
		return stream 
			.collect(Collectors 
						.toCollection(LinkedList::new)) 
			.descendingIterator(); 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 

		// Get the parallel stream 
		List<Integer> lists = Arrays.asList(11, 22, 33, 44); 
		Stream<Integer> stream = lists.parallelStream(); 

		// Reverse and print the elements 
		Iterator<Integer> reverse = reverseStream(stream); 
		reverse.forEachRemaining(System.out::println); 
	} 
} 
