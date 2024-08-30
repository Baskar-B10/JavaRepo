package com.program.collections.methods;//Java Program to Get the Size of Collection
// and Verify that Collection is Empty 
// using LinkedList class 

import java.util.*;

class ClearLinkedList {
	public static void main (String[] args) { 
		
		Collection<Integer> list = new LinkedList<Integer>(); 
		
		//add integer values in this list 
		list.add(99); 
		list.add(54); 
		list.add(112); 
		list.add(184); 
		list.add(2); 
		
		// Output the present list 
		System.out.print("The elements in Collection : "); 
		System.out.println(list); 
		
		//returns the size of the list 
		System.out.println("Size of the collection "+list.size()); 
		
		// Check if list is empty using isEmpty() method 
		System.out.println("Is the LinkedList empty: "
						+ list.isEmpty()); 
		// Clearing the LinkedList 
		list.clear(); 
	
		// printing the new list 
		System.out.println("The new List is: " + list); 
	
		// Check if list is empty 
		// using isEmpty() method 
		System.out.println("Is the LinkedList empty: "
						+ list.isEmpty()); 
	} 
} 
