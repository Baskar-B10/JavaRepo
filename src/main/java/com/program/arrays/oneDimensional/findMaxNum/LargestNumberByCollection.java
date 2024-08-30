package com.program.arrays.oneDimensional.findMaxNum;// Java Program to find the maximum
// element in an Array using
// Collections.max() method
import java.util.*;

// Driver Class
public class LargestNumberByCollection {
	// main function
	public static void main(String[] args)
	{
		// Declaring Array
		int arr[] = { 10, 324, 45, 90, 9808 };

		// Creating new List
		List<Integer> list = new ArrayList<>();
		// Adding elements in List
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}

		// Using the Method to find the maximum
		// element
		System.out.println("Largest in given array is "
						+ Collections.max(list));
	}
}
