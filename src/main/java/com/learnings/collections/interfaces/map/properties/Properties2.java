package com.learnings.collections.interfaces.map.properties;// Java program to demonstrate Properties class to get all
// the system properties 

import java.util.*;

public class Properties2 {
	public static void main(String[] args) throws Exception 
	{ 
		// get all the system properties 
		Properties p = System.getProperties(); 

		// stores set of properties information 
		Set set = p.entrySet(); 

		// iterate over the set 
		Iterator itr = set.iterator(); 
		while (itr.hasNext()) { 

			// print each property 
			Map.Entry entry = (Map.Entry)itr.next(); 
			System.out.println(entry.getKey() + " = "
							+ entry.getValue()); 
		} 
	} 
}
