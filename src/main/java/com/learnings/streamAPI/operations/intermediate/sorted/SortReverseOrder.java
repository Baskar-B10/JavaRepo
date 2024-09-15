package com.learnings.streamAPI.operations.intermediate.sorted;// Java code for forEach
// (Consumer action) in Java 8 
import java.util.*;

class SortReverseOrder {

	// Driver code 
	public static void main(String[] args) 
	{ 

		// Creating a list of Integers 
		List<Integer> list = Arrays.asList(2, 4, 6, 8, 10); 

		// Using forEach(Consumer action) to 
		// print the elements of stream 
		// in reverse order 
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		// Creating a list of Strings
		List<String> listStr = Arrays.asList("Geeks", "for",
				"GeeksforGeeks", "GeeksQuiz", "SortStringUsingCharacter");

		System.out.println("The sorted stream according "
				+ "to provided Comparator is : ");

		// Displaying the list of Strings in
		// reverse order after sorting
		listStr.stream().sorted(Comparator.reverseOrder()).
				forEach(System.out::println);
	} 
} 
