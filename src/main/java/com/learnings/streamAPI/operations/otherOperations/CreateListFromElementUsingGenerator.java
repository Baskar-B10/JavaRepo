package com.learnings.streamAPI.operations.otherOperations;// Java program to initialize a list in a single
// line with a specified value using StreamDemo

import java.util.*;
import java.util.stream.*; 

class CreateListFromElementUsingGenerator {

	// Function to create a List 
	// with the specified value 
	public static <T> List<T> createList(T N) 
	{ 

		// Currently only one value is taken 
		int size = 1; 

		return Stream 

			// Generate the StreamDemo
			.generate(String::new) 

			// Size of the List to be created 
			.limit(size) 

			// Passing the value to be mapped 
			.map(s -> N) 

			// Convert the generated stream into List 
			.collect(Collectors.toList()); 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 

		int N = 1024; 
		System.out.println("List with element "
						+ N + ": "
						+ createList(N)); 

		String str = "GeeksForGeeks"; 
		System.out.println("List with element "
						+ str + ": "
						+ createList(str)); 
	} 
} 
