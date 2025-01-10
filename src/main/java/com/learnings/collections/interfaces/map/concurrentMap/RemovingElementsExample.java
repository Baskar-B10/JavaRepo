package com.learnings.collections.interfaces.map.concurrentMap;// Java Program to demonstrate removing
// elements 

import java.util.concurrent.*; 

class RemovingElementsExample { 
	public static void main(String[] args) 
	{ 
		// Instantiate an object 
		// Since ConcurrentMap 
		// is an interface so We use 
		// ConcurrentSkipListMap 
		ConcurrentMap<Integer, Integer> mpp = new ConcurrentSkipListMap<Integer, Integer>(); 

		// Adding elements to this map 
		// using put method 
		for (int i = 1; i <= 5; i++) 
			mpp.put(i, i); 

		// remove() mapping associated 
		// with key 1 
		mpp.remove(1); 

		System.out.println("After remove(): " + mpp); 
	} 
}
