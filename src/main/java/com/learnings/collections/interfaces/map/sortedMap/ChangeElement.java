package com.learnings.collections.interfaces.map.sortedMap;// Java program to change
// the elements in SortedMap 
import java.util.*;
class ChangeElement {
	
	// Main Method 
	public static void main(String args[]) 
	{ 
		// Initialization of a SortedMap 
		// using Generics 
		SortedMap<Integer, String> tm 
			= new TreeMap<Integer, String>(); 

		// Inserting the Elements 
		tm.put(3, "Geeks"); 
		tm.put(2, "Geeks"); 
		tm.put(1, "Geeks"); 

		System.out.println(tm); 

		tm.put(2, "For"); 

		System.out.println(tm); 
	} 
}
