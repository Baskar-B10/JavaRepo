package com.program.list.initilization;

import java.util.*;
import java.util.stream.Collectors; 
import java.util.stream.Stream; 

public class Java8UsingStream {
	public static void main(String args[]) 
	{ 

		// Creating a List using Syntax 1 
		List<Integer> list1 = Stream.of(1, 2, 3) 
								.collect(Collectors.toList()); 

		// Printing the list 
		System.out.println("List using Syntax 1: "
						+ list1.toString()); 

		// Creating a List using Syntax 2 
		List<Integer> list2 = Stream 
								.of(3, 2, 1) 
								.collect( 
									Collectors 
										.toCollection(ArrayList::new)); 

		// Printing the list 
		System.out.println("List using Syntax 2: "
						+ list2.toString()); 

		// Creating a List using Syntax 3 
		List<Integer> list3 = Stream 
								.of(1, 2, 3, 4) 
								.collect( 
									Collectors 
										.collectingAndThen( 
											Collectors.toList(), 
											Collections::unmodifiableList)); 

		// Printing the list 
		System.out.println("List using Syntax 3: "
						+ list3.toString()); 
	} 
} 
