package com.program.file.basicOperation;/// Java program to illustrate a temporary file creation
import java.io.File;
import java.io.IOException;

public class DeleteTempFile {

	// FileSearch Method
	public static void main(String[] args)
		throws IOException
	{
		// Creating a string for the prefix
		String prefix = "exampleFile";

		// Creating a string for the suffix
		String suffix = ".txt";

		// Creating a File object for the directory path
		File directoryPath = new File(
			"C:\\Users\\Admin\\Desktop\\demo\\src\\main\\java\\com\\program\\file\\");

		// Creating the temporary file
		File tempFile = File.createTempFile(prefix, suffix,
											directoryPath);

		// Deleting the File after while exiting the
		// program(optional)
		tempFile.delete();
	}
}
