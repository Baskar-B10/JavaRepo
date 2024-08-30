package com.program.arrays.oneDimensional.findMaxNum;// Java Program to Find the Largest
// Element in the array using sort function
import java.util.*;

// Driver Class
class LargestNumberByArraySort {
	// main function
	// Time Complexity: O(n logn), where n represents the size of the given array.
	//Auxiliary Space: O(1), no extra space is required, so it is a constant.
	public static void main(String[] args)
	{
		int arr[] = { 12, 45, 67, 89, 100, 23,
					3456, 897, 452, 444, 899, 700 };
		
		// Sorting function using
		// Sort function
		Arrays.sort(arr);
	
		// Printing the Result
		System.out.println(
			"Largest number from given array: "
			+ arr[arr.length - 1]);
	}
}
