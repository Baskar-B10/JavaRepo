package com.program.list.splitList;// Java Program to Split a List into Two Sub-List
/// Using partitioningBy() method of Collectors class 

// Importing required classes
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// DateWithDifferentLocale class
public class SplitByPartitioningBy {

	// Method 1
	// To split a list into two sublists in Java
	public static List[] split(List<String> list)
	{

		// Setting value of midIndex using comparators
		int midIndex
			= ((list.size() / 2)
			- (((list.size() % 2) > 0) ? 0 : 1));

		// Creating object of List with reference to
		// ArrayList class Declaring object List<String>
		// type
		List<List<String> > lists = new ArrayList<>(
			list.stream()
				.collect(Collectors.partitioningBy(
					s -> list.indexOf(s) > midIndex))
				.values());

		// Returning an array containing both lists
		return new List[] { lists.get(0), lists.get(1) };
	}

	// Method 2
	// DateWithDifferentLocale driver method
	public static void main(String[] args)
	{

		// Creating an ArrayList of String type
		List<String> list = new ArrayList<String>();

		// Adding elements to List object
		// Using add() method
		list.add("Geeks");
		list.add("Practice");
		list.add("Contribute");
		list.add("IDE");
		list.add("Courses");

		// Calling split method which return List of array
		List[] lists = split(list);

		// Printing specific elements of list by
		// passing arguments with in
		System.out.println(lists[0]);
		System.out.println(lists[1]);
	}
}
