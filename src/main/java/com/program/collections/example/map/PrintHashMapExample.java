package com.program.collections.example.map;// Java program printing ArrayList
// of an user-defined collection

// Importing Classes/Files
import java.util.*;

public class PrintHashMapExample {
	String firstName;
	String lastName;

	// Constructor
	PrintHashMapExample(String fn, String ln)
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
		HashMap<Integer, PrintHashMapExample> hm
			= new HashMap<Integer, PrintHashMapExample>();

		// creating objects
		PrintHashMapExample p1
			= new PrintHashMapExample("Mohit", "Singh");
		PrintHashMapExample p2
			= new PrintHashMapExample("Tarun", "Anand");
		PrintHashMapExample p3
			= new PrintHashMapExample("Madhu", "Singh");
		PrintHashMapExample p4
			= new PrintHashMapExample("Rohit", "Ahuja");

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
