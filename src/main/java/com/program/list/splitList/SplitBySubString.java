package com.program.list.splitList;// Java Program to Split a List into Two SubList
// Using subList() method of List class

// Importing required classes
import java.util.ArrayList;
import java.util.List;

// DateWithDifferentLocale class
public class SplitBySubString {

	// Method 1
	// To split a list into two sublists in Java
	public static List[] split(List<String> list)
	{

		// Finding the size of the list using List.size()
		// and putting in a variable
		int size = list.size();

		// Creating new list and inserting values which is
		// returned by List.subList() method
		List<String> first
			= new ArrayList<>(list.subList(0, (size) / 2));
		List<String> second = new ArrayList<>(
			list.subList((size) / 2, size));

		// Returning an List of array
		return new List[] { first, second };
	}

	// Method 2
	// DateWithDifferentLocale driver method
	public static void main(String[] args)
	{

		// Creatingan ArrayList of String type
		List<String> list = new ArrayList<String>();

		// Adding elements to List object
		// Custom input elements
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
