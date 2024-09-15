package com.learnings.compareInterfaces.comparableWithSort.linkedHashMap;// Java program demonstrate how to Sort LinkedHashMap by
// keys using Comparable interface
import java.util.*;

// Student class implements comparable interface
class Student implements Comparable<Student> {
	String name;

	Student(String name) { this.name = name; }

	// override toString method
	public String toString() { return this.name; }

	// Override compareTo method to sort LinkedHashMap keys
	// in ascending order
	public int compareTo(Student stu)
	{
		return this.name.compareTo(stu.name);
	}
}

public class SortByValuesAsc {
	public static void main(String[] args)
	{

		// New LinkedHashMap
		LinkedHashMap<Student, Integer> map
			= new LinkedHashMap<>();

		// Adding elements to the map
		map.put(new Student("Bina"), 200);
		map.put(new Student("Akshay"), 400);
		map.put(new Student("Chintu"), 500);

		// Print Before sort
		System.out.println(
			"Before sort keys in ascending order : " + map);

		// TreeMap to sort LinkedHashMap using comparable
		TreeMap<Student, Integer> tree_map
			= new TreeMap<>(map);

		// Print after sorting
		System.out.println(
			"After sort keys in ascending order : "
			+ tree_map);
	}
}
