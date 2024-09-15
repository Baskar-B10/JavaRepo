package com.learnings.methodReference;// Java Program to Illustrate How One can use
// Static method reference
// To Sort with Custom Comparator

// Importing required classes
import java.util.*;

// Class 1
// Helper class
// Object need to be sorted
class Person {

	private String name;
	private Integer age;

	// Constructor
	public Person(String name, int age)
	{
		// This keyword refers to current instance itself
		this.name = name;
		this.age = age;
	}

	// Getter-setters
	public Integer getAge() { return age; }
	public String getName() { return name; }
}

// Class 2
// FindLastElementsUsingReverseSort class
public class StaticMethodRef {

	// Method 1
	// Static method to compare with name
	public static int compareByName(Persons a, Persons b)
	{
		return a.getName().compareTo(b.getName());
	}

	// Method 2
	// Static method to compare with age
	public static int compareByAge(Persons a, Persons b)
	{
		return a.getAge().compareTo(b.getAge());
	}

	// Method 3
	// FindLastElementsUsingReverseSort driver method
	public static void main(String[] args)
	{

		// Creating an empty ArrayList of user-defined type
		// List of person
		List<Persons> personsList = new ArrayList<>();

		// Adding elements to above List
		// using add() method
		personsList.add(new Persons("vicky", 24));
		personsList.add(new Persons("poonam", 25));
		personsList.add(new Persons("sachin", 19));

		// Using static method reference to
		// sort array by name
		Collections.sort(personsList, StaticMethodRef::compareByName);

		// Display message only
		System.out.println("Sort by name :");

		// Using streams over above object of Persons type
		personsList.stream()
			.map(x -> x.getName())
			.forEach(System.out::println);

		// Now using static method reference
		// to sort array by age
		Collections.sort(personsList, StaticMethodRef::compareByAge);

		// Display message only
		System.out.println("Sort by age :");

		// Using streams over above object of Persons type
		personsList.stream()
			.map(x -> x.getName())
			.forEach(System.out::println);
	}
}
