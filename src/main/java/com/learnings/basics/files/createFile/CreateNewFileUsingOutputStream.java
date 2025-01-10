package com.learnings.basics.files.createFile;// Java Program to create new file
// using FileOutputStream class

// Importing File Classes
import java.io.FileOutputStream;

// Importing BufferedReader Class for taking input
import java.io.BufferedReader;

// Importing as it converts bits to strings
import java.io.InputStreamReader;

// Function Helping Create New File
public class CreateNewFileUsingOutputStream {

	// Main Driver Method
	public static void main(String args[])
	{
		// Creating File Object
		CreateNewFileUsingOutputStream gfg = new CreateNewFileUsingOutputStream();
		gfg.newFile();
	}

	// Function To Create A New File
	public void newFile()
	{
		String strFilePath = "", strFileName = "";

		// Try-Catch Block
		try {

			// Creating BufferClass Object
			BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
			System.out.println("Enter the file name:");

			// Asking file name from User
			strFileName = br.readLine();
			System.out.println("Enter the file path:");

			// Asking file path from User
			strFilePath = br.readLine();

			// Creating Object of FileOutputStream Class
			FileOutputStream fos = new FileOutputStream(
				strFilePath + "" + strFileName + ".txt");
		}

		// Try-Catch Block
		catch (Exception ex1) {
		}
	}
}
