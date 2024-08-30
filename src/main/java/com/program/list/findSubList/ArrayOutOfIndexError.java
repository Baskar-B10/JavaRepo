package com.program.list.findSubList;// Java program to demonstrate subList()
// method for IndexOutOfBoundsException 

import java.util.*; 

public class ArrayOutOfIndexError
{ 
	// DateWithDifferentLocale Method
	public static void main(String[] argv) throws Exception 
	{ 
		
		// Exception try-catch block 
		try { 

			ArrayList<Integer> arrlist = new ArrayList<Integer>(); 

			// Populating arrlist1 
			arrlist.add(1); 
			arrlist.add(4); 
			arrlist.add(9); 
			arrlist.add(25); 
			arrlist.add(36); 

			// Print arrlist 
			System.out.println("Original arrlist: " + arrlist); 

			// Getting the subList 
			// Using subList() method 
			System.out.println("\nEnd index value is out of range"); 
			List<Integer> arrlist2 = arrlist.subList(2, 7); 

			// Print the subList 
			System.out.println("Sublist of arrlist: " + arrlist2); 
		} 
		
		// Exception try-catch block 
		catch (IndexOutOfBoundsException e) 
		{ 
			System.out.println("Exception thrown : " + e); 
		} 

		// Exception try-catch block 
		catch (IllegalArgumentException e) 
		{ 
			System.out.println("Exception thrown : " + e); 
		} 
		
	} 
	
}
