package com.program.collections.methods;// Java Program to demonstrate working of shuffle()
// with user provided source of randomness 

// Importing required utility classes 
import java.util.*; 

// FileSearch class
public class ShuffleWithRandomArrayList {

	// FileSearch driver method
	public static void main(String[] args) 
	{ 

		// Creating an empty ArrayList of string type 
		ArrayList<String> mylist = new ArrayList<String>(); 

		// Adding custom input elements to above created 
		// object 
		mylist.add("code"); 
		mylist.add("quiz"); 
		mylist.add("geeksforgeeks"); 
		mylist.add("quiz"); 
		mylist.add("practice"); 
		mylist.add("qa"); 

		// Print and display the elements of List on console 
		System.out.println("Original List : \n" + mylist); 

		// Shuffling the given list 
		// using Random() method 
		Collections.shuffle(mylist, new Random()); 

		// Print the updated list on console 
		System.out.println( 
			"\nShuffled List with Random() : \n" + mylist); 

		// Shuffling list by using Random(3) 
		Collections.shuffle(mylist, new Random(3)); 

		// Print the updated list on console 
		System.out.println( 
			"\nShuffled List with Random(3) : \n" + mylist); 

		// Again shuffling list by using Random(3) 
		Collections.shuffle(mylist, new Random(5)); 

		System.out.println( 
			"\nShuffled List with Random(5) : \n" + mylist); 
	} 
}
