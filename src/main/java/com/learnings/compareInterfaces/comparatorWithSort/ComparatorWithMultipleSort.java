package com.learnings.compareInterfaces.comparatorWithSort;// Java Program to Demonstrate Working of
// Comparator Interface Via More than One Field

// Importing required classes
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// Class 1
// Helper class representing a Student
class Students {

	// Attributes of student
	String Name;
	int Age;

	// Parameterized constructor
	public Students(String Name, Integer Age)
	{

		// This keyword refers to current instance itself
		this.Name = Name;
		this.Age = Age;
	}

	// Getter setter methods
	public String getName() { return Name; }

	public void setName(String Name) { this.Name = Name; }

	public Integer getAge() { return Age; }

	public void setAge(Integer Age) { this.Age = Age; }

	// Method
	// Overriding toString() method
	@Override public String toString()
	{
		return "Customer{"
			+ "Name=" + Name + ", Age=" + Age + '}';
	}
}

// Class 2
// Helper class implementing Comparator interface
class CustomerSortingComparator
	implements Comparator<Students> {

	// Method 1
	// To compare customers
	@Override
	public int compare(Students customer1, Students customer2)
	{

		// Comparing customers
		int NameCompare = customer1.getName().compareTo(
			customer2.getName());

		int AgeCompare = customer1.getAge().compareTo(
			customer2.getAge());

		// 2nd level comparison
		return (NameCompare == 0) ? AgeCompare
								: NameCompare;
	}
}

// Method 2
// SortByAscOrder driver method
public class ComparatorWithMultipleSort {
	public static void main(String[] args)
	{

		// Create an empty ArrayList
		// to store Student
		List<Students> al = new ArrayList<Students>();

		// Create customer objects
		// using constructor initialization
		Students obj1 = new Students("Ajay", 27);
		Students obj2 = new Students("Sneha", 23);
		Students obj3 = new Students("Simran", 37);
		Students obj4 = new Students("Ajay", 22);
		Students obj5 = new Students("Ajay", 29);
		Students obj6 = new Students("Sneha", 22);

		// Adding customer objects to ArrayList
		// using add() method
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		al.add(obj4);
		al.add(obj5);
		al.add(obj6);

		// Iterating using Iterator
		// before Sorting ArrayList
		Iterator<Students> custIterator = al.iterator();

		// Display message
		System.out.println("Before Sorting:\n");

		// Holds true till there is single element
		// remaining in List
		while (custIterator.hasNext()) {

			// Iterating using next() method
			System.out.println(custIterator.next());
		}

		// Sorting using sort method of Collections class
		Collections.sort(al,
						new CustomerSortingComparator());

		// Display message only
		System.out.println("\n\nAfter Sorting:\n");

		// Iterating using enhanced for-loop
		// after Sorting ArrayList
		for (Students customer : al) {
			System.out.println(customer);
		}
	}
}
