package com.program.exceptions.checked;// Java Program to Handle Checked Exception
// Where FileInputStream Exception is thrown

// Importing required classes
import java.io.*;

// FileSearch class
class HandleFileNotFoundExceptionExample {

	// FileSearch driver method
	public static void main(String[] args)
			throws FileNotFoundException
	{

		// Assigning null value to object of FileInputStream
		FileInputStream GFG = null;

		// Try block to check for exceptions
		try {

			// Giving path where file should exists to read
			// content
			GFG = new FileInputStream(
					"/home/mayur/HandleArrayOutOfBoundExample.txt");
		}

		// Catch block to handle exceptions
		catch (FileNotFoundException e) {

			// Display message when exception occurs
			System.out.println("File does not exist");
		}
	}
}
