package com.learnings.streamAPI.operations.combinationOfOperations.flatenStream;// Java program to flatten a stream of arrays
// using forEach() method 

import java.util.ArrayList; 
import java.util.Arrays; 
import java.util.List; 
import java.util.stream.Stream; 

class UsingForEachForMultiDChar {

	// Function to flatten a StreamDemo of Arrays
	public static <T> Stream<T> flattenStream(T[][] arrays) 
	{ 

		// Create an empty list to collect the stream 
		List<T> list = new ArrayList<>(); 

		// Using forEach loop 
		// convert the array into stream 
		// and add the stream into list 
		for (T[] array : arrays) { 
			Arrays.stream(array) 
				.forEach(list::add); 
		} 

		// Convert the list into StreamDemo and return it
		return list.stream(); 
	} 

	public static void main(String[] args) 
	{ 

		// Get the arrays to be flattened. 
		Character[][] arr = { 
			{ 'G', 'e', 'e', 'k', 's' }, 
			{ 'F', 'o', 'r' }, 
			{ 'G', 'e', 'e', 'k', 's' } 
		}; 

		// Flatten the StreamDemo
		Character[] flatArray = flattenStream(arr) 
									.toArray(Character[] ::new); 

		// Print the flattened array 
		System.out.println(Arrays.toString(flatArray)); 
	} 
} 
