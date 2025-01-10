package com.learnings.collections.interfaces.map.identityHashMap;// Java code to demonstrate IdentityHashMap

import java.util.Map; 
import java.util.HashMap; 
import java.util.IdentityHashMap; 

public class IdentityHashMapExample 
{ 
	public static void main(String[] args) 
	{ 
		// creating an instance of IdentityHashMap 
		Map<String, String> ihm = new IdentityHashMap<>(); 

		// Putting key and value pair 
		// in a IdentityHashMap Object 
		ihm.put("ihmkey","ihmvalue"); 
		ihm.put(new String("ihmkey"),"ihmvalue1"); 
		
		// ihm.size() will print 2 since it 
		// compares the objects by reference 
		System.out.println("Size of IdentityHashMap--"+ihm.size()); 
		
	} 
}
