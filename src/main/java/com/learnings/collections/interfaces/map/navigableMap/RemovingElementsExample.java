package com.learnings.collections.interfaces.map.navigableMap;// Java Program for deleting
// elements from NavigableMap 
import java.util.*; 

class RemovingElementsExample { 
	
	public static void main(String args[]) 
	{ 
		// Instantiate an object 
		// Since NavigableMap 
		// is an interface 
		// We use TreeMap 
		NavigableMap<Integer, String> nmap 
			= new TreeMap<Integer, String>(); 

		// Add elements using put() 
		nmap.put(3, "Geeks"); 
		nmap.put(2, "Geeks"); 
		nmap.put(1, "Geeks"); 
		nmap.put(4, "For"); 

		// Print the contents on the console 
		System.out.println("Mappings of NavigableMap : "
						+ nmap); 

		// Remove elements using remove() 
		nmap.remove(4); 

		// Print the contents on the console 
		System.out.println( 
			"\nNavigableMap, after remove operation : "
			+ nmap); 

		// Clear the entire map using clear() 
		nmap.clear(); 
		System.out.println( 
			"\nNavigableMap, after clear operation : "
			+ nmap); 
	} 
}
