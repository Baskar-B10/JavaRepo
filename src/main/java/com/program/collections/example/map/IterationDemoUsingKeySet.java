package com.program.collections.example.map;// Java program to demonstrate iteration
// over keys and searching for values 

import java.util.Map; 
import java.util.HashMap; 

class IterationDemoUsingKeySet
{ 
	public static void main(String[] arg) 
	{ 
		Map<String,String> gfg = new HashMap<String,String>(); 
	
		// enter name/url pair 
		gfg.put("LinkedListToArray", "geeksforgeeks.org");
		gfg.put("Practice", "practice.geeksforgeeks.org"); 
		gfg.put("Code", "code.geeksforgeeks.org"); 
		gfg.put("Quiz", "www.geeksforgeeks.org"); 
		
		// looping over keys 
		for (String name : gfg.keySet()) 
		{ 
			// search for value 
			String url = gfg.get(name); 
			System.out.println("Key = " + name + ", Value = " + url); 
		} 
	} 
} 
