package com.program.search;// Java Program to Demonstrate Working of binarySearch()
// method of Collections class

// Importing required classes
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// DateWithDifferentLocale class
public class BinarySearchUsingCollection {

	//Time complexity: O(log N)
	//Auxiliary space: O(1)
	// DateWithDifferentLocale driver method
	public static void main(String[] args)
	{
		// Creating an empty ArrayList of integer type
		List<Integer> al = new ArrayList<Integer>();

		// Populating the Arraylist
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(10);
		al.add(20);

		// 10 is present at index 3
		int key = 10;
		int res = Collections.binarySearch(al, key);

		if (res >= 0)
			System.out.println(
				key + " found at index = " + res);
		else
			System.out.println(key + " Not found");

		key = 15;
		res = Collections.binarySearch(al, key);

		if (res >= 0)
			System.out.println(
				key + " found at index = " + res);
		else
			System.out.println(key + " Not found");
	}
}
