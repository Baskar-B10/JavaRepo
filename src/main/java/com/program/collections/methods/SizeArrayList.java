package com.program.collections.methods;//Java Program to Get the Size of Collection and
// Verify that Collection is Empty 
// using ArrayList class 

import java.util.*;

class SizeArrayList {
	public static void main (String[] args) { 
		
		Collection<String> arraylist = new ArrayList<String>(); 
		
		arraylist.add("Geeks"); 
		arraylist.add("for"); 
		arraylist.add("geeks"); 
		
		// returns the size of the arraylist 
		System.out.println("Size of the collection "+arraylist.size()); 
		
		// Check if list is empty using isEmpty() method 
		System.out.println("Is the ArrayList empty: "
						+ arraylist.isEmpty()); 
	} 
} 
