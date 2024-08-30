package com.program.list.initilization;

import java.util.List;

public class Java9UnModifiedList {
	public static void main(String args[]) 
	{ 

		// Creating a list using List.of() 
		List<Integer> unmodifiableList = List.of(1, 2, 3); 

		// Printing the List 
		System.out.println("List : "
						+ unmodifiableList.toString()); 
	} 
} 
