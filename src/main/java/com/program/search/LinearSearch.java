package com.program.search;

// Java code for linearly search x in arr[]. If x
// is present then return its location, otherwise 
// return -1 
class LinearSearch { 
	// This function returns index of element x in arr[]

	//Time Complexity
	//BEST CASE COMPLEXITY
	//In linear search, the best-case occurs when the search element is present at the first location of the array. So the best-case time complexity of the linear search is O(1).
	//
	//The best-case time complexity of the linear search is O(1).
	//
	//AVERAGE CASE COMPLEXITY
	//In linear search average case occurs when the search element is present at the random location of the array.so the average case time complexity of the linear search is O(1).
	//The average case time complexity of the linear search is O(n).
	//
	//WORST-CASE COMPLEXITY
	//In linear search, the worst case occurs when the search element is present at the last location of the array So the worst-case time complexity of the linear search is O(1).In the worst case in if the search element is not present in the given array then we need to traverse the entire array to search element. So the worst-case time complexity of the linear search is O(n).
	//The worst-case time complexity of the linear search is O(n).
	//
	//SPACE COMPLEXITY
	//
	//The SPACE complexity of the linear search is O(1)
	static int search(int arr[], int n, int x) 
	{ 
		for (int i = 0; i < n; i++) { 
			// Return the index of the element if the element 
			// is found 
			if (arr[i] == x) 
				return i; 
		} 

		// return -1 if the element is not found 
		return -1; 
	} 

	public static void main(String[] args) 
	{ 
		int[] arr = { 3, 4, 1, 7, 5 }; 
		int n = arr.length; 
		
		int x = 4; 

		int index = search(arr, n, x); 
		if (index == -1) 
			System.out.println("Element is not present in the array"); 
		else
			System.out.println("Element found at position " + index); 
	} 
} 
