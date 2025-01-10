package com.learnings.collections.interfaces.map.concurrentMap;

import java.util.concurrent.*;
import java.util.*; 

public class TraversingExample { 

	public static void main(String[] args) 
	{ 

		// Instantiate an object 
		// Since ConcurrentMap 
		// is an interface so We use 
		// ConcurrentSkipListMap 
		ConcurrentMap<Integer, String> chmap = new ConcurrentSkipListMap<Integer, String>(); 

		// Add elements using put() 
		chmap.put(8, "Third"); 
		chmap.put(6, "Second"); 
		chmap.put(3, "First"); 
		chmap.put(11, "Fourth"); 

		// Create an Iterator over the 
		// ConcurrentSkipListMap 
		Iterator<ConcurrentSkipListMap 
					.Entry<Integer, String> > itr 
			= chmap.entrySet().iterator(); 

		// The hasNext() method is used to check if there is 
		// a next element The next() method is used to 
		// retrieve the next element 
		while (itr.hasNext()) { 
			ConcurrentSkipListMap 
				.Entry<Integer, String> entry 
				= itr.next(); 
			System.out.println("Key = " + entry.getKey() 
							+ ", Value = "
							+ entry.getValue()); 
		} 
	} 
}
