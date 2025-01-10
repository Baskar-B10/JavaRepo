package com.learnings.collections.interfaces.map.navigableMap;// Java Program for traversing
// a NavigableMap 
import java.util.*; 

class TraversalExample { 
	
	public static void main(String args[]) 
	{ 
		// Instantiate an object 
		// Since NavigableMap is an interface 
		// We use TreeMap 
		NavigableMap<Integer, String> nmap 
			= new TreeMap<Integer, String>(); 

		// Add elements using put() 
		nmap.put(3, "Geeks"); 
		nmap.put(2, "For"); 
		nmap.put(1, "Geeks"); 

		// Create an Iterator over the 
		// NavigableMap 
		Iterator<NavigableMap.Entry<Integer, String> > itr 
			= nmap.entrySet().iterator(); 

		System.out.println("Traversing using Iterator: "); 
		// The hasNext() method is used to check if there is 
		// a next element The next() method is used to 
		// retrieve the next element 
		while (itr.hasNext()) { 
			NavigableMap.Entry<Integer, String> entry 
				= itr.next(); 
			System.out.println("Key = " + entry.getKey() 
							+ ", Value = "
							+ entry.getValue()); 
		} 

		System.out.println("Traversing using for-each: "); 
		// Iterate using for-each loop 
		for (Map.Entry mapElement : nmap.entrySet()) { 
			// get the key using getKey() 
			int key = (int)mapElement.getKey(); 

			// Finding the value 
			String value = (String)mapElement.getValue(); 

			System.out.println("Key = " + key 
							+ ", Value = " + value); 
		} 
	} 
}
