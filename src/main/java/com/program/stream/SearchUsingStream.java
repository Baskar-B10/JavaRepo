package com.program.stream;// Java program to check whether
// an element is present in array or not

import java.util.Arrays;
import java.util.stream.IntStream;

class SearchUsingStream {

	// Function return true if given element
	// found in array
	//Time Complexity: O(N)
	//Auxiliary Space: O(1)
	private static void checkUsingIntStream(int[] arr, int toCheckValue)
	{
		// check if the specified element
		// is present in the array or not
		// using anyMatch() method
		boolean test
			= IntStream.of(arr)
				.anyMatch(x -> x == toCheckValue);

		// Print the result
		System.out.println("Is " + toCheckValue
						+ " present in the array: " + test);
	}

	private static void checkUsingArrayStream (int[] arr, int toCheckValue){
		boolean test = Arrays.stream(arr).anyMatch(x-> x==toCheckValue);
		System.out.println("Is " + toCheckValue
				+ " present in the array: " + test);
	}

	public static void main(String[] args)
	{

		// Get the array
		int arr[] = { 5, 1, 1, 9, 7, 2, 6, 10 };

		// Get the value to be checked
		int toCheckValue = 7;

		// Print the array
		System.out.println("Array: "
						+ Arrays.toString(arr));

		// Check if this value is
		// present in the array or not
		checkUsingIntStream(arr, toCheckValue);
		checkUsingArrayStream(arr, toCheckValue);
	}
}
