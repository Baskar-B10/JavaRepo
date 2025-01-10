package com.learnings.collections.interfaces.map.navigableMap;// Java Program for accessing
// elements in a NavigableMap 

import java.util.*; 

public class AccessingElementsExample { 

	public static void main(String[] args) 
	{ 
		// Instantiate an object 
		// Since NavigableMap is an interface 
		// We use TreeMap 
		NavigableMap<Integer, String> nmap 
			= new TreeMap<Integer, String>(); 

		// Add elements using put() 
		nmap.put(8, "Third"); 
		nmap.put(6, "Second"); 
		nmap.put(3, "First"); 
		nmap.put(11, "Fourth"); 

		// Accessing the elements using get() 
		// with key as a parameter 
		System.out.println(nmap.get(3)); 
		System.out.println(nmap.get(6)); 
		System.out.println(nmap.get(8)); 
		System.out.println(nmap.get(11)); 

		// Display the set of keys using keySet() 
		System.out.println("\nThe NavigableMap key set: "
						+ nmap.keySet()); 
	} 
}
