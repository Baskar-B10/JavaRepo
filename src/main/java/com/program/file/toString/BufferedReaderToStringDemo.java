package com.program.file.toString;// Importing java libraries
import java.io.*; 
import java.util.Scanner; 

public class BufferedReaderToStringDemo {

	// FileSearch driver method
	public static void main(String[] args) 
	{ 
		Scanner s = new Scanner(System.in); 
		System.out.println("Enter the file path: "); 
		String filename = s.nextLine(); 
		try { 
			// Creating an InputStream object 
			InputStream is = new FileInputStream(filename); 

			// creating an InputStreamReader object 
			InputStreamReader isr 
				= new InputStreamReader(is); 

			// Creating a BufferedReader object 
			BufferedReader br = new BufferedReader(isr); 
			StringBuffer sb = new StringBuffer(); 

			String str; 

			while ((str = br.readLine()) != null) { 
				sb.append(str); 
			} 
			System.out.println(sb.toString()); 
		} 
		catch (IOException e) { 
			System.out.println(e); 
		} 
	} 
}
