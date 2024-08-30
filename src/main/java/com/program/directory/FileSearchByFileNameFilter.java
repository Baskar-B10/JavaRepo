package com.program.directory;// Java Program to Search for a File in a Directory
import java.io.*; 

// MyFilenameFilter class implements FilenameFilter 
// interface 
class MyFilenameFilter implements FilenameFilter { 
	
	String initials; 
	
	// constructor to initialize object 
	public MyFilenameFilter(String initials) 
	{ 
		this.initials = initials; 
	} 
	
	// overriding the accept method of FilenameFilter 
	// interface 
	public boolean accept(File dir, String name) 
	{ 
		return name.startsWith(initials); 
	} 
} 

public class FileSearchByFileNameFilter {
	
	public static void main(String[] args) 
	{ 
		// Create an object of the File class 
		// Replace the file path with path of the directory 
		File directory = new File("C:\\Users\\Admin\\Desktop\\demo");

		// Create an object of Class MyFilenameFilter 
		// Constructor with name of file which is being 
		// searched 
		MyFilenameFilter filter 
			= new MyFilenameFilter("test.txt");

		// store all names with same name 
		// with/without extension 
		String[] flist = directory.list(filter); 

		// Empty array 
		if (flist == null) { 
			System.out.println( 
				"Empty directory or directory does not exists."); 
		} 
		else { 

			// Print all files with same name in directory 
			// as provided in object of MyFilenameFilter 
			// class 
			for (int i = 0; i < flist.length; i++) { 
				System.out.println(flist[i]+" found"); 
			} 
		} 
	} 
}
