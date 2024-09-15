package com.learnings.compareInterfaces.comparableWithSort.linkedHashMap;// Java program demonstrate how to Sort LinkedHashMap by
// keys using Comparable interface
import java.util.*;

// Student class implements comparable interface
class Students implements Comparable<Students> {
	String name;

	Students(String name) { this.name = name; }

	// override toString method
	public String toString() { return this.name; }

	// Override compareTo method to sort LinkedHashMap keys
	// in ascending order
	public int compareTo(Students stu)
	{
		 return stu.name.compareTo(this.name);
	}
}

class SortByValuesDesc {
	public static void main(String[] args)
	{

		// New LinkedHashMap
		LinkedHashMap<Students, Integer> map
			= new LinkedHashMap<>();

		// Adding elements to the map
		map.put(new Students("Bina"), 200);
		map.put(new Students("Akshay"), 400);
		map.put(new Students("Chintu"), 500);

		// Print Before sort
		System.out.println(
			"Before sort keys in descending  order : " + map);

		// TreeMap to sort LinkedHashMap using comparable
		TreeMap<Students, Integer> tree_map
			= new TreeMap<>(map);

		// Print after sorting
		System.out.println(
			"After sort keys in descending  order : "
			+ tree_map);
	}
}
