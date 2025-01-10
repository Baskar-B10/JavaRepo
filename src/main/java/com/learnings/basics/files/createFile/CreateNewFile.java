package com.learnings.basics.files.createFile;// Java Program to create new file using File class

// Importing new files
import java.io.File;
import java.io.BufferedReader;

// Importing as it converts bits to strings
import java.io.InputStreamReader;

public class CreateNewFile {

	// Main Driver Method
	public static void main(String args[])
	{
		// Creating New File via function
		CreateNewFile gfg = new CreateNewFile();
		gfg.newFile();
	}

	// Function To Make New File
	public void newFile()
	{
		String strPath = "", strName = "";

		// Try-catch Block
		try {

			// Creating BufferedReadered object
			BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
			System.out.println("Enter the file name:");

			// Reading File name
			strName = br.readLine();
			System.out.println("Enter the file path:");

			// Reading File Path
			strPath = br.readLine();

			// Creating File Object
			File file1
				= new File(strPath + "" + strName + ".txt");

			// Method createNewFile() method creates blank
			// file.
			file1.createNewFile();
		}

		// Try-Catch Block
		catch (Exception ex1) {
		}
	}
}
