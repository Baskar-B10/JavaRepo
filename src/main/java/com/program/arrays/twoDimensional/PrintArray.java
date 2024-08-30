package com.program.arrays.twoDimensional;// Java program to print the elements of
// a 2 D array or matrix
import java.io.*;
import java.util.Arrays;

class PrintArray {

	public static void print2DUsingIterateOver(int mat[][])
	{
		// Loop through all rows
		for (int i = 0; i < mat.length; i++)

			// Loop through all elements of current row
			for (int j = 0; j < mat[i].length; j++)
				System.out.print(mat[i][j] + " ");
	}

	public static void print2DUsingForEach(int mat[][])
	{
		// Loop through all rows
		for (int[] row : mat)

			// Loop through all columns of current row
			for (int x : row)
				System.out.print(x + " ");
	}

	public static void print2DUsingArrayToString(int mat[][])
	{
		// Loop through all rows
		for (int[] row : mat)

			// converting each row as string
			// and then printing in a separate line
			System.out.println(Arrays.toString(row));
	}
	public static void print2DUsingArrayDeepString(int mat[][])
	{
		System.out.println(Arrays.deepToString(mat));
	}


	public static void main(String args[])
		throws IOException
	{
		int mat[][] = { { 1, 2, 3, 4 },
						{ 5, 6, 7, 8 },
						{ 9, 10, 11, 12 } };
//Time Complexity: O(N*M) where N is the number of rows in the matrix and M is the number of columns in the matrix.
//Auxiliary Space: O(1)
		System.out.println("print 2D Using Iterate Over");
		print2DUsingIterateOver(mat);

		System.out.println("\nprint 2D Using For Each");
		print2DUsingForEach(mat);
		//Time Complexity: O(N*M)
		//Auxiliary Space: O(1)
		System.out.println("\nprint 2D Using Array ToString()");
		print2DUsingArrayToString(mat);
		//Time Complexity: O(N*M)
		//Auxiliary Space: O(1)
		System.out.println("print 2D Using Array Deep String()");
		print2DUsingArrayDeepString(mat);

	}
}
