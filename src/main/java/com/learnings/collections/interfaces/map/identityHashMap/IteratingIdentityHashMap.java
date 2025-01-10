package com.learnings.collections.interfaces.map.identityHashMap;// Java code to illustrate the
// iterating over IdentityHashmap 

import java.util.*; 

public class IteratingIdentityHashMap { 

	public static void main(String[] args) 
	{ 

		// Creating an empty IdentityHashMap 
		IdentityHashMap<Integer, String> identity_hash 
			= new IdentityHashMap<Integer, String>(); 

		// Mapping string values to int keys 
		identity_hash.put(10, "Geeks"); 
		identity_hash.put(15, "4"); 
		identity_hash.put(20, "Geeks"); 
		identity_hash.put(25, "Welcomes"); 
		identity_hash.put(30, "You"); 

		// Displaying the IdentityHashMap 
		System.out.println("Initial Mappings are: "
						+ identity_hash); 

		// Create an Iterator over the 
		// IdentityHashMap 
		Iterator<IdentityHashMap.Entry<Integer, String> > 
			itr = identity_hash.entrySet().iterator(); 

		// The hasNext() method is used to check if there is 
		// a next element The next() method is used to 
		// retrieve the next element 
		while (itr.hasNext()) { 
			IdentityHashMap.Entry<Integer, String> entry 
				= itr.next(); 
			System.out.println("Key = " + entry.getKey() 
							+ ", Value = "
							+ entry.getValue()); 
		} 
	} 
}
