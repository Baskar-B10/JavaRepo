package com.program.collections.example.list;// Java program printing ArrayList
// of an user-defined collection

// Importing Classes/Files
import java.util.*;

public class PrintArrayListExample {
	String firstName;
	String lastName;

	// Constructor
	PrintArrayListExample(String fn, String ln)
	{
		firstName = fn;
		lastName = ln;
	}

	// Function- toString()
	public String toString()
	{
		// Over-riding the toString method to print the
		// collection
		return "| First Name : " + firstName
			+ " | LastName : " + lastName;
	}

	// Driver FileSearch Method
	public static void main(String[] args)
	{
		// Creating a hashmap with key as ID and
		// value as user defined class
		HashMap<Integer, PrintArrayListExample> hm
			= new HashMap<Integer, PrintArrayListExample>();

		// creating objects
		PrintArrayListExample p1
			= new PrintArrayListExample("Mohit", "Singh");
		PrintArrayListExample p2
			= new PrintArrayListExample("Tarun", "Anand");
		PrintArrayListExample p3
			= new PrintArrayListExample("Madhu", "Singh");
		PrintArrayListExample p4
			= new PrintArrayListExample("Rohit", "Ahuja");

		// adding mappings
		hm.put(101, p1);
		hm.put(102, p2);
		hm.put(103, p3);
		hm.put(104, p4);

		// Iterating HashMap through for loop and printing the collection
		for (Map.Entry m : hm.entrySet())
			System.out.println(m.getKey() + " "
							+ m.getValue().toString());
	}
}
