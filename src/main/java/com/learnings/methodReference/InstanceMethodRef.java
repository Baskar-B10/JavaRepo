package com.learnings.methodReference;// Java Program to Illustrate How One can use
// Static method reference
// To Sort with Custom Comparator
// But using object method reference

// Importing required classes
import java.util.*;

// Class 1
// Helper class
// Object need to be sorted
class Persons {

	// Attributes of a person
	private String name;
	private Integer age;

	// Constructor
	public Persons(String name, int age)
	{
		// This keyword refers to current object itself
		this.name = name;
		this.age = age;
	}

	// Getter-setter methods
	public Integer getAge() { return age; }
	public String getName() { return name; }
}

// Class 2
// Helper class
// Comparator class
class ComparisonProvider {

	// Method 1
	// To compare with name
	public int compareByName(Persons a, Persons b)
	{
		return a.getName().compareTo(b.getName());
	}

	// Method 2
	// To compare with age
	public int compareByAge(Persons a, Persons b)
	{
		return a.getAge().compareTo(b.getAge());
	}
}

// Class 3
// FindLastElementsUsingReverseSort class
public class InstanceMethodRef {

	// FindLastElementsUsingReverseSort driver method
	public static void main(String[] args)
	{
		// Creating an empty ArrayList of user-defined type
		// List of person
		List<Persons> personsList = new ArrayList<>();

		// Adding elements to above object
		// using add() method
		personsList.add(new Persons("vicky", 24));
		personsList.add(new Persons("poonam", 25));
		personsList.add(new Persons("sachin", 19));

		// A comparator class with multiple
		// comparator methods
		ComparisonProvider comparator
			= new ComparisonProvider();

		// Now using instance method reference
		// to sort array by name
		Collections.sort(personsList,
						comparator::compareByName);

		// Display message only
		System.out.println("Sort by name :");

		// Using streams
		personsList.stream()
			.map(x -> x.getName())
			.forEach(System.out::println);

		// Using instance method reference
		// to sort array by age
		Collections.sort(personsList,
						comparator::compareByAge);

		// Display message only
		System.out.println("Sort by age :");

		personsList.stream()
			.map(x -> x.getName())
			.forEach(System.out::println);
	}
}
