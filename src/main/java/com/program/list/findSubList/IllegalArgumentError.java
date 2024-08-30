package com.program.list.findSubList;// Java program to demonstrate
// subList() method 
// for IllegalArgumentException 

import java.util.*; 

public class IllegalArgumentError
{ 
	// DateWithDifferentLocale Method
	public static void main(String[] argv) throws Exception 
	{ 
		
		// Exception try-catch block 
		try { 

			ArrayList<String> arrlist = new ArrayList<String>(); 

			// Populating arrlist1 
			arrlist.add("Example"); 
			arrlist.add("in"); 
			arrlist.add("Geeks"); 
			arrlist.add("for"); 
			arrlist.add("Geeks"); 


			// Print arrlist 
			System.out.println("Original arrlist: "
							+ arrlist); 

			// Getting the subList 
			// Using subList() method 
			System.out.println("\nEndpoint indices "
							+ "are out of order"
							+ " (fromIndex > toIndex)"); 
			List<String> arrlist2 = arrlist.subList(9, 3); 

			// print the subList 
			System.out.println("Sublist of arrlist: "
							+ arrlist2); 
			} 
		
		// Exception try-catch block 
		catch (IndexOutOfBoundsException e) 
		{ 
			System.out.println("Exception thrown: " + e); 
		} 

		// Exception try-catch block 
		catch (IllegalArgumentException e) 
		{ 
			System.out.println("Exception thrown: " + e); 
		} 
		
	} 
	
}
