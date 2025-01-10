package com.learnings.collections.interfaces.map.properties;// Java program to demonstrate Properties class to get
// information from the properties file 

import java.util.*; 
import java.io.*; 
public class Properties1 {
	public static void main(String[] args) throws Exception 
	{ 
		// create a reader object on the properties file 
		FileReader reader = new FileReader("db.properties"); 

		// create properties object 
		Properties p = new Properties(); 

		// Add a wrapper around reader object 
		p.load(reader); 

		// access properties data 
		System.out.println(p.getProperty("username")); 
		System.out.println(p.getProperty("password")); 
	} 
}
