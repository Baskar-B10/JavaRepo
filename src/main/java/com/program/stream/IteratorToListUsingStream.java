package com.program.stream;// Java program to get a List
// from a given Iterator 

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

class IteratorToListUsingStream {

	// Function to get the List 
	public static <T> List<T> 
	getListFromIterator(Iterator<T> iterator) 
	{ 

		// Convert iterator to iterable 
		Iterable<T> iterable = () -> iterator; 

		// Create a List from the Iterable 
		List<T> list = StreamSupport 
						.stream(iterable.spliterator(), false) 
						.collect(Collectors.toList()); 

		// Return the List 
		return list; 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 

		// Get the Iterator 
		Iterator<Integer> 
			iterator = Arrays.asList(1, 2, 3, 4, 5) 
						.iterator(); 

		// Get the List from the Iterator 
		List<Integer> 
			list = getListFromIterator(iterator); 

		// Print the list 
		System.out.println(list); 
	} 
} 
