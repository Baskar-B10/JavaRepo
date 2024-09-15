package com.learnings.compareInterfaces.comparableWithSort.linkedHashMap;// Java program to sort the values of LinkedHashMap

// Importing required classes from 
// java.util package 
import java.util.*; 
import java.util.ArrayList; 
import java.util.Collections; 
import java.util.Comparator; 
import java.util.LinkedHashMap; 
import java.util.List; 
import java.util.Map.*; 

// Class 
public class SortByKey {

	// Main driver method 
	public static void main(String[] args) 
	{ 

		// Creating an LinkedHashMap object 
		LinkedHashMap<String, Integer> l_map 
			= new LinkedHashMap<String, Integer>(); 

		// Adding element to LinkedHashSet 
		// Custom inputs 
		l_map.put("Computer", 1); 
		l_map.put("Science", 3); 
		l_map.put("Portal", 2); 

		// Display message 
		System.out.print( 
			"LinkedHashMap without sorting : "); 

		// Print the elements of Map in above object 
		// just after addition without sorting 
		System.out.println(l_map); 

		// Convert key-value from the LinkedHashMap to List 
		// using entryset() method 
		List<Map.Entry<String, Integer> > list 
			= new ArrayList<Map.Entry<String, Integer> >( 
				l_map.entrySet()); 

		// Comparable Interface function to 
		// sort the values of List 
		Collections.sort( 
			list, 
			new Comparator<Map.Entry<String, Integer> >() { 
				// Comparing entries 
				public int compare( 
					Entry<String, Integer> entry1, 
					Entry<String, Integer> entry2) 
				{ 
					return entry1.getValue() 
						- entry2.getValue(); 
				} 
			}); 

		// Clear the above LinkedHashMap 
		// using clear() method 
		l_map.clear(); 

		// Iterating over elements using for each loop 
		for (Map.Entry<String, Integer> entry : list) { 

			// Put all sorted value back to the 
			// LinkedHashMap 
			l_map.put(entry.getKey(), entry.getValue()); 
		} 

		// Display and print 
		// the sorted value of LinkedHashMap 
		System.out.println( 
			"LinkedHashMap after sorting : " + l_map); 
	} 
}
