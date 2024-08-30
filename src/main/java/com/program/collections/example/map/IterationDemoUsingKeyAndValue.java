package com.program.collections.example.map;// Java program to demonstrate iteration over
// Map using keySet() and values() methods 

import java.util.Map; 
import java.util.HashMap; 

class IterationDemoUsingKeyAndValue
{ 
	public static void main(String[] arg) 
	{ 
		Map<String,String> gfg = new HashMap<String,String>(); 
	
		// enter name/url pair 
		gfg.put("LinkedListToArray", "geeksforgeeks.org");
		gfg.put("Practice", "practice.geeksforgeeks.org"); 
		gfg.put("Code", "code.geeksforgeeks.org"); 
		gfg.put("Quiz", "www.geeksforgeeks.org"); 
		
		// using keySet() for iteration over keys 
		for (String name : gfg.keySet()) 
			System.out.println("key: " + name); 
		
		// using values() for iteration over values 
		for (String url : gfg.values()) 
			System.out.println("value: " + url); 
	} 
} 
