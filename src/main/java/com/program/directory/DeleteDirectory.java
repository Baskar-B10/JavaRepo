package com.program.directory;// Java program to delete a directory

import java.io.File;
//import org.apache.commons.io.FileUtils;

class DeleteDirectory {

	public static void main(String[] args)
	{
		// store file path
		String filepath = "C:\\Users\\Admin\\Desktop\\test";
		File file = new File(filepath);

		// call deleteDirectory method to delete directory
		// recursively
		//FileUtils.deleteDirectory(file);

		// delete CreateDirectoryUsingMkDir folder
		//file.delete();
	}
}
