package com.program.list.splitList;// Java Program to Split a List into Two Sublist

// Importing required classes
import java.util.ArrayList;
import java.util.List;

// DateWithDifferentLocale class
public class SplitByNaiveMethod {

	// Method 1
	// To split a list into two sublists in Java
	public static List[] split(List<String> list)
	{

		// Creating two empty lists
		List<String> first = new ArrayList<String>();
		List<String> second = new ArrayList<String>();

		// Getting size of the list
		// using size() method
		int size = list.size();

		// Step 1
		// (First size)/2 element copy into list
		// first and rest second list
		for (int i = 0; i < size / 2; i++)
			first.add(list.get(i));

		// Step 2
		// (Second size)/2 element copy into list first and
		// rest second list
		for (int i = size / 2; i < size; i++)
			second.add(list.get(i));

		// Returning a List of array
		return new List[] { first, second };
	}

	// Method 2
	// DateWithDifferentLocale driver method
	public static void main(String[] args)
	{

		// Creating an ArrayList of string type
		List<String> list = new ArrayList<String>();

		// Adding elements to list object
		// using add() method
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
