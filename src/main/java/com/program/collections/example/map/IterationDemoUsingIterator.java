package com.program.collections.example.map;// Java program to demonstrate iteration over
// Map using keySet() and values() methods 

import java.util.Map; 
import java.util.HashMap; 
import java.util.Iterator; 

class IterationDemoUsingIterator
{ 
	public static void main(String[] arg) 
	{ 
		Map<String,String> gfg = new HashMap<String,String>(); 
	
		// enter name/url pair 
		gfg.put("LinkedListToArray", "geeksforgeeks.org");
		gfg.put("Practice", "practice.geeksforgeeks.org"); 
		gfg.put("Code", "code.geeksforgeeks.org"); 
		gfg.put("Quiz", "www.geeksforgeeks.org"); 
		
		// using iterators 
		Iterator<Map.Entry<String, String>> itr = gfg.entrySet().iterator(); 
		
		while(itr.hasNext()) 
		{ 
			Map.Entry<String, String> entry = itr.next(); 
			System.out.println("Key = " + entry.getKey() + 
								", Value = " + entry.getValue()); 
		} 
	} 
} 
