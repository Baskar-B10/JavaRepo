package com.program.arrays.oneDimensional.findMaxNum;// Java Program to find maximum in arr[]

// Driver Class
class LargestNumberByBruteForceMethod
{ 
	// array declared
	static int arr[] = {10, 324, 45, 90, 9808}; 
	
	// Method to find maximum in arr[]
	//Time Complexity: O(n), where n represents the size of the given array.
	//Auxiliary Space: O(1), no extra space is required, so it is a constant.
	static int largest() 
	{ 
		int i; 
		
		// Initialize maximum element 
		int max = arr[0]; 
		
		// Traverse array elements from second and 
		// compare every element with current max 
		for (i = 1; i < arr.length; i++) 
			if (arr[i] > max) 
				max = arr[i]; 
		
		return max; 
	} 
	
	// Driver method 
	public static void main(String[] args) 
	{ 

		System.out.println("Largest in given array is " + largest());
	} 
} 
