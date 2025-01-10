package com.learnings.basics.files.fileClass;// Java program to create a text File using FileWriter

import java.io.FileWriter; 
import java.io.IOException;

class FileWriterDemo {
	public static void main(String[] args) 
		throws IOException 
	{ 
		// initialize a string 
		String str = "ABC"; 
		try { 

			// attach a file to FileWriter 
			FileWriter fw 
				= new FileWriter("D:/data/file.txt"); 

			// read each character from string and write 
			// into FileWriter 
			for (int i = 0; i < str.length(); i++) 
				fw.write(str.charAt(i)); 

			System.out.println("Successfully written"); 

			// close the file 
			fw.close(); 
		} 
		catch (Exception e) { 
			e.getStackTrace(); 
		} 
	} 
}
