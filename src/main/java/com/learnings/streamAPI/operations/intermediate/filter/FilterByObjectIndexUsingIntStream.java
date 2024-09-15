package com.learnings.streamAPI.operations.intermediate.filter;// Java program to demonstrate
// filter by Object properties 
// using IntSteam Approach 

import java.io.*; 
import java.util.stream.IntStream; 
class FilterByObjectIndexUsingIntStream { 

	public static void filterByIndexUsingStream() 
	{ 
		// create an array of Strings 
		String[] myArray 
			= new String[] { "stream", "is", "a", 
							"sequence", "of", "elements", 
							"like",	 "list" }; 

		// create instream on range of integers 
		// filter by even integer and map 
		// the integer to the Object of myArray 
		IntStream.rangeClosed(0,myArray.length-1)
				.filter(x -> x%2==0)// filter even words position (i)
				.mapToObj(x-> myArray[x])// get words by position got from filter
			.forEach(System.out::println); 
	} 

	public static void main(String[] args) 
	{ 
		filterByIndexUsingStream(); 
	} 
}
