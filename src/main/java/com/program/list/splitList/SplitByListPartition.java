package com.program.list.splitList;// Java Program to Split a List into Two Sub-List

// Importing Guava library
//import com.google.common.collect.Iterables;
// Importing required classes
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// DateWithDifferentLocale class
public class SplitByListPartition {

	// Method 1
	// To split a list into two sublists in Java
	/*public static List[] split(List<String> list)
	{

		// Partition the List into two sublists and
		// getting iterator
		Iterator<List<String> > itr
			= Iterables.partition(list, (list.size()) / 2)
				.iterator();

		// Returning an array containing both lists
		return new List[] { new ArrayList<>(itr.next()),
							new ArrayList<>(itr.next()) };
	}

	// Method 2
	// DateWithDifferentLocale driver method
	public static void main(String[] args)
	{

		// Creating an ArrayList of string type
		List<String> list = new ArrayList<String>();

		// Adding elements t oabove object
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
	}*/
}
