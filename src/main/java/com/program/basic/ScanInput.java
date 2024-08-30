package com.program.basic;// Java program to take an integer

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// Driver Class
class ScanInput {
	// main function
	public static void main(String[] args) throws IOException
	{
		// Declare the variables
		int num;
	// Input the integer
		System.out.println("Enter the integer: ");

		// Create Scanner object
		Scanner s = new Scanner(System.in);

		// Read the next integer from the screen
		num = s.nextInt();

		// Display the integer
		System.out.println("Entered integer is: "
						+ num);

		// Enter data using BufferReader
		System.out.println("Enter the Name: ");
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));

		// Reading data using readLine
		String name = reader.readLine();

		// Printing the read line
		System.out.println(name);
	}
}
