package com.program.file.toString;// Importing java libraries
import java.io.FileInputStream; 
import java.io.IOException; 
import java.util.Scanner; 

public class ScannerToStringDemo {

	// FileSearch driver method
	public static void main(String[] args) 
	{ 

		// Taking input from the user 
		Scanner s = new Scanner(System.in); 
		System.out.println("Enter the file path: "); 
		String filename = s.nextLine(); 
		try { 

			// Creating an InputStream object 
			FileInputStream fis 
				= new FileInputStream(filename); 

			// Creating a Scanner object 
			Scanner sc = new Scanner(fis); 

			// Reading line by line from scanner to 
			// StringBuffer 

			StringBuffer sb = new StringBuffer(); 
			while (sc.hasNext()) { 
				sb.append(sc.nextLine()); 
			} 

			System.out.println(sb.toString()); 
		} 

		// Catch block to handle exceptions 
		catch (IOException e) { 
			System.out.println(e); 
		} 
	} 
}
