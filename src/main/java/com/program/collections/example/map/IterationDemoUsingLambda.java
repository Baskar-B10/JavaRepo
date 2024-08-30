package com.program.collections.example.map;// Java code illustrating iteration
// over map using forEach(action) method 

import java.util.Map; 
import java.util.HashMap; 

class IterationDemoUsingLambda
{ 
	public static void main(String[] arg) 
	{ 
		Map<String,String> gfg = new HashMap<String,String>(); 
	
		// enter name/url pair 
		gfg.put("LinkedListToArray", "geeksforgeeks.org");
		gfg.put("Practice", "practice.geeksforgeeks.org"); 
		gfg.put("Code", "code.geeksforgeeks.org"); 
		gfg.put("Quiz", "www.geeksforgeeks.org"); 
		
		// forEach(action) method to iterate map 
		gfg.forEach((k,v) -> System.out.println("Key = "
				+ k + ", Value = " + v)); 
		
	} 
} 
