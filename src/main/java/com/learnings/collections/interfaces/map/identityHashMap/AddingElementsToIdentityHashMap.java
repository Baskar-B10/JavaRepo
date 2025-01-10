package com.learnings.collections.interfaces.map.identityHashMap;// Java code to illustrate
// adding elements to IdentityHashMap 
import java.util.*; 

public class AddingElementsToIdentityHashMap { 
	
	public static void main(String[] args) 
	{ 
		// Creating an empty IdentityHashMap 
		Map<Integer, String> identity_hash 
			= new IdentityHashMap<Integer, String>(); 

		// Mapping string values to int keys 
		// using put() method 
		identity_hash.put(10, "Geeks"); 
		identity_hash.put(15, "4"); 
		identity_hash.put(20, "Geeks"); 
		identity_hash.put(25, "Welcomes"); 
		identity_hash.put(30, "You"); 

		// Displaying the IdentityHashMap 
		System.out.println("Initial Mappings are: "
						+ identity_hash); 

		// Inserting existing key along with new value 
		// previous value gets returned and stored in 
		// returned_value 
		String returned_value 
			= (String)identity_hash.put(20, "All"); 

		// Verifying the returned value 
		System.out.println("Returned value is: "
						+ returned_value); 

		// Displaying the new map 
		System.out.println("New map is: " + identity_hash); 

		// Creating a new Identityhash map and copying 
		Map<Integer, String> new_Identityhash_map 
			= new IdentityHashMap<Integer, String>(); 
		new_Identityhash_map.putAll(identity_hash); 

		// Displaying the final IdentityHashMap 
		System.out.println("The new map: "
						+ new_Identityhash_map); 
	} 
}
