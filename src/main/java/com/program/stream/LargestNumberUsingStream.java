package com.program.stream;// Java Program to Find the Largest
// Element in Array using Java Stream
import java.util.Arrays;

// Driver Class
public class LargestNumberUsingStream {
	// main function
	//Time Complexity: O(n), where n represents the size of the given array.
	//Auxiliary Space: O(1), no extra space is required, so it is a constant.
	public static void main(String[] args){ 
		int arr[] = {10, 324, 45, 90, 9808}; 
		
		// Java Stream and max to find the max element
		// in array
		int max = Arrays.stream(arr).max().getAsInt(); 
	
		// Printing the result
		System.out.println("Largest in given array is " +max); 
	} 

} 
