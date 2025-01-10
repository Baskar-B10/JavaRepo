package com.learnings.collections.interfaces.map.concurrentMap;// Java Program to demonstrate adding
// elements 

import java.util.concurrent.*; 

class AddingElementsExample { 
	public static void main(String[] args) 
	{ 
		// Instantiate an object 
		// Since ConcurrentMap 
		// is an interface so We use 
		// ConcurrentSkipListMap 
		ConcurrentMap<Integer, Integer> mpp = new ConcurrentSkipListMap<Integer, Integer>(); 

		// Adding elements to this map 
		// using put() method 
		for (int i = 1; i <= 5; i++) 
			mpp.put(i, i); 

		// Print map to the console 
		System.out.println("After put(): " + mpp); 
	} 
}
