package com.program.collections.methods;// Java Program to Rotate Elements of the List

import java.util.*;
class RotateRightInList {
	public static void main(String[] args) 
	{ 
		// creating array list 
		List<Integer> my_list = new ArrayList<>(); 
		my_list.add(10); 
		my_list.add(20); 
		my_list.add(30); 
		my_list.add(40); 
		my_list.add(50); 
		my_list.add(60); 
		my_list.add(70); 

		// Printing list before rotation 
		System.out.println( 
			"List Before Rotation : "
			+ Arrays.toString(my_list.toArray())); 

		// Rotating the list at distance 4 

		Collections.rotate(my_list, 4); 

		// Printing list after rotation 
		System.out.println( 
			"List After Rotation : "
			+ Arrays.toString(my_list.toArray())); 
	} 
}
