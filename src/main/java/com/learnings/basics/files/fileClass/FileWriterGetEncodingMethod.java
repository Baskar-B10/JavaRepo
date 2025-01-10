package com.learnings.basics.files.fileClass;// java program to show the usage
// of getEncoding() function 

import java.io.FileWriter; 
import java.nio.charset.Charset; 

class FileWriterGetEncodingMethod {
	public static void main(String[] args) 
	{ 

		String file = "output.txt"; 

		try { 
			// Creates a FileReader with default encoding 
			FileWriter o1 = new FileWriter(file); 

			// Creates a FileReader specifying the encoding 
			FileWriter o2 = new FileWriter( 
				file, Charset.forName("UTF11")); 

			// Returns the character encoding of the reader 
			System.out.println("Character encoding of o1: "
							+ o1.getEncoding()); 
			System.out.println("Character encoding of o2: "
							+ o2.getEncoding()); 

			// Closes the reader 
			o1.close(); 
			o2.close(); 
		} 

		catch (Exception e) { 
			e.getStackTrace(); 
		} 
	} 
}
