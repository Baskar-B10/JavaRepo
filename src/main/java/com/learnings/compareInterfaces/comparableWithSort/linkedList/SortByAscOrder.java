package com.learnings.compareInterfaces.comparableWithSort.linkedList;// Java Program to Sort LinkedList using Comparable
// in ascending order
import java.util.Collections;
import java.util.LinkedList;
//Time Complexity: O(n log n)
// User defined class implements Comparable
class Student implements Comparable<Student> {
	String Name;
	int Id;
	int Rank;

	Student(String name, int id, int rank)
	{
		this.Name = name;
		this.Id = id;
		this.Rank = rank;
	}

	// Override the compareTo() method
	@Override public int compareTo(Student s)
	{
		if (Rank > s.Rank) {
			return 1;
		}
		else if (Rank == s.Rank) {
			return 0;
		}
		else {
			return -1;
		}
	}
}

public class SortByAscOrder {
	// SortByAscOrder driver method
	public static void main(String[] args)
	{
		// Create one LinkedList for Student object
		LinkedList<Student> List
			= new LinkedList<Student>();
		List.add(new Student("Meet", 32, 2));
		List.add(new Student("Jhon", 11, 5));
		List.add(new Student("Sham", 92, 1));
		List.add(new Student("William", 86, 3));
		List.add(new Student("Harry", 35, 4));

		// Print the Unsorted LinkedList
		System.out.println("UnSorted List");
		for (Student s : List) {
			System.out.println(s.Rank + " " + s.Name + " "
							+ s.Id);
		}
		System.out.println();

		// sort in ascending order
		Collections.sort(List);

		// Print the sorted LinkedList
		System.out.println("Sorted List");
		for (Student s : List) {
			// Print the sorted LinkedList
			System.out.println(s.Rank + " " + s.Name + " "
							+ s.Id);
		}
	}
}
