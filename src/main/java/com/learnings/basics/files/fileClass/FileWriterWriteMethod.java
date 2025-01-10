package com.learnings.basics.files.fileClass;// Java program to write text to file

import java.io.FileWriter; 

public class FileWriterWriteMethod {

	public static void main(String args[]) 
	{ 

		String data = "Welcome to gfg"; 

		try { 
			// Creates a FileWriter 
			FileWriter output 
				= new FileWriter("output.txt"); 

			// Writes the string to the file 
			output.write(data); 

			// Closes the writer 
			output.close(); 
		} 

		catch (Exception e) { 
			e.getStackTrace(); 
		} 
	} 
}
