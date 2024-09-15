package com.learnings.streamAPI.operations.combinationOfOperations.flatenStream;// Java program to flatten a stream of map
// using forEach() method 

import java.util.*;

class UsingForEachForMapValuesInt {

	// Function to flatten a StreamDemo of Map
	public static <T> List<T> flattenStream(Collection<List<T> > lists) 
	{ 

		// Create an empty list to collect the stream 
		List<T> finalList = new ArrayList<>(); 

		// Using forEach loop 
		// convert each list into stream 
		// and add the stream into list 
		for (List<T> list : lists) { 
			list.stream() 
				.forEach(finalList::add); 
		} 

		// Return the final flattened list 
		return finalList; 
	} 

	public static void main(String[] args) 
	{ 

		// Get the map to be flattened. 
		Map<Integer, List<Integer> > map = new HashMap<>(); 
		map.put(1, Arrays.asList(1, 2)); 
		map.put(2, Arrays.asList(3, 4, 5, 6)); 
		map.put(3, Arrays.asList(7, 8, 9)); 

		// Flatten the StreamDemo
		List<Integer> flatList = flattenStream(map.values()); 

		// Print the flattened list 
		System.out.println(flatList); 
	} 
} 
