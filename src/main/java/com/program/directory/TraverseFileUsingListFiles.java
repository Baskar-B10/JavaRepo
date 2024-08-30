package com.program.directory;// Java Program to Traverse Through a Directory

// Importing required classes
import java.io.File;

// FileSearch class
class TraverseFileUsingListFiles {

	// Method 1
	// To display files
	public static void displayFiles(File[] files)
	{
		// Traversing through the files array
		for (File filename : files) {
			// If a sub directory is found,
			// print the name of the sub directory
			if (filename.isDirectory()) {
				System.out.println("Directory: "
								+ filename.getName());

				// and call the displayFiles function
				// recursively to list files present
				// in sub directory
				displayFiles(filename.listFiles());
			}

			// Printing the file name present in given path
			else {
				// Getting the file name
				System.out.println("File: "
								+ filename.getName());
			}
		}
	}

	// Method 2
	// FileSearch driver method
	public static void main(String[] args)
	{
		// Storing the name of files and directories
		// in an array of File type
		File[] files = new File("C:\\Users\\Admin\\Desktop\\demo\\src\\main\\java\\com\\program").listFiles();

		// Calling method 1 to
		// display files
		displayFiles(files);
	}
}
