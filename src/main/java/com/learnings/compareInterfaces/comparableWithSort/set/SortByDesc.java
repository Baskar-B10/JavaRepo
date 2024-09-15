package com.learnings.compareInterfaces.comparableWithSort.set;// Java program to demonstrate how to Sort HashSet using
// Comparable interface

import java.util.*;

// Student class implements comparable interface
class Students implements Comparable<Students> {

	Integer marks;

	Students(Integer marks) { this.marks = marks; }

	// override toString method
	public String toString() { return (" " + this.marks); }

	// Override compareTo method to sort HashSet in
	// descending order
	public int compareTo(Students stu)
	{
		return stu.marks.compareTo(this.marks);
	}
}

class SortByDesc {
	public static void main(String[] args)
	{

		// New HashSet
		HashSet<Students> set = new HashSet<>();

		// Adding elements to the set
		set.add(new Students(500));
		set.add(new Students(300));
		set.add(new Students(400));
		set.add(new Students(100));
		set.add(new Students(200));

		// Print Before sort
		System.out.println("Before sort elements in descending order : "
			+ set);

		// TreeSet to sort HashSet using comparable
		// interface
		TreeSet<Students> tree_set = new TreeSet<Students>(set);

		// Print after sorting
		System.out.println("After sort elements in descending order : "
			+ tree_set);
	}
}
