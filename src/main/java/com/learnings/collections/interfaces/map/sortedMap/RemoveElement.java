package com.learnings.collections.interfaces.map.sortedMap;// Java program to remove the
// elements from SortedMap 
import java.util.*;

class RemoveElement {
	
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
		tm.put(4, "For"); 

		System.out.println(tm); 

		tm.remove(4); 

		System.out.println(tm); 
	} 
}
