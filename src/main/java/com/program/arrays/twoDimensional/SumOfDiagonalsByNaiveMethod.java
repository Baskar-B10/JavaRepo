package com.program.arrays.twoDimensional;// Java Program to Find the Sum of Diagonals of a Matrix

// Importing input output classes

// DateWithDifferentLocale Class
public class SumOfDiagonalsByNaiveMethod {

	//1. The principal diagonal is constituted by the elements
	// a00, a11, a22, a33, and the row-column condition
	// for the principal diagonal is: row = column
	//
	//2. However, the secondary diagonal is constituted by the
	// elements a03, a12, a21, a30, and the row-column condition
	// for the Secondary diagonal is: row + column = N – 1
	// To calculate Sum of Diagonals
	//Time complexity: O(N2)
	//Auxiliary space: O(1)
	static void Sum_of_Diagonals1(int[][] matrix, int N) 
	{ 
		// Declaring and initializing two variables to zero 
		// initially for primary and secondary diagonal 
		// count 
		int Pd = 0, Sd = 0; 

		// Two Nested for loops for iteration over a matrix 
		// Outer loop for rows 
		for (int k = 0; k < N; k++) { 

			// Inner loop for columns 
			for (int l = 0; l < N; l++) { 

				// Condition for the principal 
				// diagonal 
				if (k == l) 
					Pd += matrix[k][l]; 

				// Condition for the secondary diagonal 
				if ((k + l) == (N - 1)) 
					Sd += matrix[k][l]; 
			} 
		} 

		// Print and display the sum of primary diagonal 
		System.out.println("Sum of Principal Diagonal:"
						+ Pd); 
		// Print and display the sum of secondary diagonal 
		System.out.println("Sum of Secondary Diagonal:"
						+ Sd); 
	} 


	// DateWithDifferentLocale driver method
	static public void main(String[] args)
	{

		// Input integer array
		// Custom entries in an array
		int[][] b = { { 8, 2, 13, 4 },
					{ 9, 16, 17, 8 },
					{ 1, 22, 3, 14 },
					{ 15, 6, 17, 8 } };

		// Passing the array as an argument to the
		// function defined above
		Sum_of_Diagonals1(b, 4);
	
	}
}
