package com.learnings.compareInterfaces.comparableWithSort.linkedList;// Sort LinkedList using Comparable in Java
import java.util.Collections;
import java.util.LinkedList;
//Time Complexity: O(n log n)
// User defined class implements Comparable
class Students implements Comparable<Students> {
	String Name;
	int Id;
	int Rank;

	Students(String name, int id, int rank)
	{
		this.Name = name;
		this.Id = id;
		this.Rank = rank;
	}

	// Override the compareTo() method
	@Override public int compareTo(Students s)
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

public class SortByDescOrder {
	// Main driver method
	public static void main(String[] args)
	{
		// Create one LinkedList for Student object
		LinkedList<Students> List
			= new LinkedList<Students>();
		List.add(new Students("Meet", 32, 2));
		List.add(new Students("Jhon", 11, 5));
		List.add(new Students("Sham", 92, 1));
		List.add(new Students("William", 86, 3));
		List.add(new Students("Harry", 35, 4));

		// Print the Unsorted LinkedList
		System.out.println("UnSorted List");
		for (Students s : List) {
			System.out.println(s.Rank + " " + s.Name + " "
							+ s.Id);
		}
		System.out.println();

		// sort in descending order
		Collections.sort(List, Collections.reverseOrder());

		// Print the sorted LinkedList
		System.out.println("Sorted List");
		for (Students s : List) {
			// Students the sorted LinkedList
			System.out.println(s.Rank + " " + s.Name + " "
							+ s.Id);
		}
	}
}
