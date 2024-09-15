package com.learnings.streamAPI.operations.combinationOfOperations.flatenStream;// Java program to flatten a stream of lists
// using forEach() method 

import java.util.ArrayList; 
import java.util.Arrays; 
import java.util.List; 
import java.util.stream.*; 

class UsingForEachForListInt {

	// Function to flatten a StreamDemo of Lists
	public static <T> Stream<T> flattenStream(List<List<T> > lists) 
	{ 

		// Create an empty list to collect the stream 
		List<T> finalList = new ArrayList<>(); 

		// Using forEach loop 
		// convert the list into stream 
		// and add the stream into list 
		for (List<T> list : lists) { 
			list.stream() 
				.forEach(finalList::add); 
		} 

		// Convert the list into StreamDemo and return it
		return finalList.stream(); 
	} 

	public static void main(String[] args) 
	{ 

		// Get the lists to be flattened. 
		List<Integer> a = Arrays.asList(1, 2); 
		List<Integer> b = Arrays.asList(3, 4, 5, 6); 
		List<Integer> c = Arrays.asList(7, 8, 9); 

		List<List<Integer> > arr = new ArrayList<List<Integer> >(); 
		arr.add(a); 
		arr.add(b); 
		arr.add(c); 

		// Flatten the StreamDemo
		List<Integer> flatList = new ArrayList<Integer>(); 
		flatList = flattenStream(arr) 
					.collect(Collectors.toList()); 

		// Print the flattened list 
		System.out.println(flatList); 
	} 
} 
