package com.program.directory;// Java program to delete a directory

import java.io.File;

class DeleteDirectoryUsingListFiles {

	// function to delete subdirectories and files
	public static void deleteDirectory(File file)
	{
		// store all the paths of files and folders present
		// inside directory
		for (File subfile : file.listFiles()) {

			// if it is a subfolder,e.g Rohan and Ritik,
			// recursively call function to empty subfolder
			if (subfile.isDirectory()) {
				deleteDirectory(subfile);
			}

			// delete files and empty subfolders
			subfile.delete();
		}
	}

	public static void main(String[] args)
	{
		// store file path
		String filepath = "C:\\Users\\Admin\\Desktop\\test";
		File file = new File(filepath);

		// call deleteDirectory function to delete
		// subdirectory and files
		deleteDirectory(file);

		// delete main CreateDirectoryUsingMkDir folder
		file.delete();
	}
}
