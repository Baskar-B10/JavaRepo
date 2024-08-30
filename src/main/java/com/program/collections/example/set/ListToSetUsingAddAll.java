package com.program.collections.example.set;

import java.util.*;

class ListToSetUsingAddAll {

	// Generic function to convert list to set
	public static <T> Set<T> convertListToSet(List<T> list)
	{
		// create a set from the List using addAll() method
		HashSet<T> set = new HashSet<>();
		set.addAll(list);
		return set;
	}

	public static void main(String args[])
	{

		// Create a stream of integers
		List<String> list = Arrays.asList(
			"GeeksForGeeks", "Geeks", "forGeeks",
			"A computer portal", "for", "Geeks");

		// Print the List
		System.out.println("List: " + list);

		// Convert List to stream
		Set<String> set = convertListToSet(list);

		// Print the Set
		System.out.println("Set from List: " + set);
	}
}
