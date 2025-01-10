package com.learnings.collections.interfaces.map.identityHashMap;// Java code to illustrate removing
// elements from IdentityHashMap 

import java.util.*; 

public class RemovingMappingsFromIdentityHashMap { 
	public static void main(String[] args) 
	{ 

		// Creating an empty IdentityHashMap 
		Map<Integer, String> Identity_hash = new
					IdentityHashMap<Integer, String>(); 
	
		// Mapping string values to int keys 
		Identity_hash.put(10, "Geeks"); 
		Identity_hash.put(15, "4"); 
		Identity_hash.put(20, "Geeks"); 
		Identity_hash.put(25, "Welcomes"); 
		Identity_hash.put(30, "You"); 

		// Displaying the IdentityHashMap 
		System.out.println("Initial Mappings are: " + 
										Identity_hash); 

		// Removing the existing key mapping 
		String returned_value = 
						(String)Identity_hash.remove(20); 

		// Verifying the returned value 
		System.out.println("Returned value is: " + 
									returned_value); 

		// Displaying the new map 
		System.out.println("New map is: " + Identity_hash); 
	} 
} 
