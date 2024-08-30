package com.program.collections.example.list;// Java program to get a List
// from a given Iterator 

import java.util.*; 

class IteratorToListUsingNaive {

	// Function to get the List 
	public static <T> List<T> 
	getListFromIterator(Iterator<T> iterator) 
	{ 

		// Create an empty list 
		List<T> list = new ArrayList<>(); 

		// Add each element of iterator to the List 
		iterator.forEachRemaining(list::add); 

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
