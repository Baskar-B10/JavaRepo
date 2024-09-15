package com.learnings.compareInterfaces.comparableWithSort.linkedHashSet;// Java program demonstrate how to Sort LinkedHashSet using
// Comparable interface
import java.util.*;

// Student class implements comparable interface
class Students implements Comparable<Students> {
	Integer marks;

	Students(Integer marks) { this.marks = marks; }

	// override toString method
	public String toString() { return (" " + this.marks); }

	// Override compareTo method to sort LinkedHashSet in
	// descending order
	public int compareTo(Students stu)
	{
		return stu.marks.compareTo(this.marks);
	}
}

class SortByDesc {
	public static void main(String[] args)
	{

		// New LinkedHashSet
		LinkedHashSet<Students> set = new LinkedHashSet<>();

		// Adding elements to the set
		set.add(new Students(500));
		set.add(new Students(300));
		set.add(new Students(400));
		set.add(new Students(100));
		set.add(new Students(200));

		// Print Before sort
		System.out.println(
			"Before sort elements in descending order : "
			+ set);

		// TreeSet to sort LinkedHashSet using comparable
		TreeSet<Students> tree_set = new TreeSet<>(set);

		// Print after sorting
		System.out.println(
			"After sort elements in descending order : "
			+ tree_set);
	}
}
