package com.program.list.initilization;

import java.util.*;

public class CollectionUnModifiableList {
	public static void main(String args[]) 
	{ 

		// Creating the list 
		List<Integer> list = Collections.unmodifiableList( 
			Arrays.asList(1, 2, 3)); 

		// Print the list 
		System.out.println("List : " + list.toString());



		try {
			// Creating the list
			List<Integer> list1 = Collections.unmodifiableList(
					Arrays.asList(1, 2, 3));

			// Print the list
			System.out.println("List : " + list1.toString());

			// Trying to modify the list
			System.out.println("Trying to modify the list");
			list1.set(0, list.get(0));
		}

		catch (Exception e) {
			System.out.println("Exception : " + e);
		}
	} 
} 
