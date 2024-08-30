package com.program.arrays.oneDimensional.findMaxNum;// Java Program to Find the Largest
// Element in Array using Java Stream

// Driver Class
public class LargestNumberByCustomSort {

	// Returns maximum in arr[] of size n
	static int largest(int arr[],int n)
	{
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			// Move elements of arr[0..i-1], that are
			// greater than key, to one position ahead
			// of their current position
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}

		return arr[n-1];
	}
	// main function
	public static void main(String[] args){


		// DateWithDifferentLocale function

			int[] arr = { 10, 324, 45, 90, 9808 };
			int n = arr.length;
			System.out.println(largest(arr, n));

	} 

} 
