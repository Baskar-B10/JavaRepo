package com.learnings.streamAPI.operations.intermediate.sorted;// Java Program to illustrate Intermediate Method of StreamDemo
// Case 2: sorted() Method 

// Importing input output class
// Importing List class from java.util package
import java.util.Arrays;
import java.util.List;

// FindLastElementsUsingReverseSort class
class SortedNumbers {

	// Method 1
	// To print the elements of the Sorted List
	public static void
	printSortedList(List<Integer> intList)
	{

		// Sorts and returns the stream to the forEach
		// illustrating stream method
		intList.stream().sorted().forEach(System.out::println);
	}

	// Method 2
	// FindLastElementsUsingReverseSort driver method
	public static void main(String[] args)
	{

		// Creating an object of List class
		// Declaring object of Integer type

		// Custom entries
		List<Integer> intList
			= List.of(68, 45, 99, 21, 8, 76, 34, 19);

		// Display message only
		System.out.println(
			"Elements of Sorted List are as follows : ");

		// Calling the method to print the Sorted List
		printSortedList(intList);


		// Creating a list of integers
		List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);

		System.out.println("The sorted stream is : ");

		// displaying the stream with elements
		// sorted in natural order
		list.stream().sorted().forEach(System.out::println);
	}
}
