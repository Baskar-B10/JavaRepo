package com.program.collections.example.set;// Java Program to convert
// List to Set in Java 8

import java.util.*;

class ListToSetUsingConstructor {

	// Generic function to convert list to set
	public static <T> Set<T> convertListToSet(List<T> list)
	{
		// create an empty set
		Set<T> set = new HashSet<>();

		// Add each element of list into the set
		for (T t : list)
			set.add(t);

		// return the set
		return set;
	}

	public static void main(String args[])
	{

		// Create a stream of integers
		List<String> list = Arrays.asList("GeeksForGeeks",
										"Geeks",
										"forGeeks",
										"A computer portal",
										"for",
										"Geeks");

		// Print the List
		System.out.println("List: " + list);

		// Convert List to stream
		Set<String> set = convertListToSet(list);

		// Print the Set
		System.out.println("Set from List: " + set);
	}
}
