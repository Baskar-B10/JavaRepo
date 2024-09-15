package com.learnings.streamAPI.basics.immuatableStream;// Java Program to illustrate Collecting a StreamDemo to
// an Immutable Collection
// Post java 10
// Using toUnmodifiableMap() method 

// Importing required libraries
import java.util.ArrayList;
import java.util.List;

// FindLastElementsUsingReverseSort Class
// ImmutableCollectionMap
public class UsingUnModifiableMap {

	// FindLastElementsUsingReverseSort driver method
	public static void main(String[] args)
	{

		// Creating a Map from a StreamDemo of books by
		// creating an object of List class of books type
		List<Books> libInventory = new ArrayList<Books>();

		// Adding elements to the above object created
		// Custom input entries
		libInventory.add(
			new Books(1, "Pride and Prejudice"));
		libInventory.add(new Books(2, "The Sign of Four"));
		libInventory.add(
			new Books(3, "Sense and Sensibility"));
		libInventory.add(new Books(4, "Mansfield Park"));
		libInventory.add(
			new Books(5, "The Materese Circle"));
		libInventory.add(
			new Books(6, "The Hound of Baskerville"));
		libInventory.add(new Books(7, "Goodnight Moon"));
		libInventory.add(new Books(
			8, "How many sleeps till my Birthday"));
		libInventory.add(
			new Books(9, "The Bourne Identity"));
		libInventory.add(new Books(10, "Murder She Wrote"));
		libInventory.add(new Books(
			11, "The adventures of Hercule Poirot"));
		libInventory.add(
			new Books(12, "The song of Ice and Fire"));

		// Creating a Map class object
		// Declaring object of integer and string type
		/*Map<Integer, String> unmutableInventory
			= libInventory.stream().collect(
				Collectors.toUnmodifiableMap(
					Books::getBookNumber,
					Books::getBookName));*/

		// Print all the elements in the Map object created
		// above
		//System.out.println(unmutableInventory);

		// This will result in an Exception
		//unmutableInventory.put(13, "Some book");
	}
}
class Books{
	private int id;
	private String name;

	public Books(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}




}
