package com.program.list;// java program print first and last element of a List
import java.util.ArrayList; 
import java.util.List; 
public class FindFirstLast { 
	public static void getFirstLat(List<Integer> list) 
	{ 

		// Displaying ArrayList elements 
		System.out.println("ArrayList contains: " + list); 

		// Logic to get the last element from ArrayList 
		if (list != null && !list.isEmpty()) { 
			System.out.println("First element is: "
							+ list.get(0)); 
			System.out.println("Last element is: "
							+ list.get(list.size() - 1)); 
			return; 
		} 
	} 

	public static void main(String[] args) 
	{ 
		/* Creating ArrayList of Integer and adding 
		elements to it */
		List<Integer> al = new ArrayList<Integer>(); 
		al.add(3); 
		al.add(1); 
		al.add(4); 
		al.add(5); 
		al.add(2); 

		getFirstLat(al); 
	} 
} 
