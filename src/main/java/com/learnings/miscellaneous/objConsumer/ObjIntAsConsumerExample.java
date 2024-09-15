package com.learnings.miscellaneous.objConsumer;// Java code to demonstrate
// accept() method of ObjIntConsumer Interface 

import java.util.Arrays; 
import java.util.List; 
import java.util.function.ObjIntConsumer;

public class ObjIntAsConsumerExample {
	public static void main(String args[]) 
	{ 

		// Get the list from which 
		// the Interface is to be instantiated. 
		List<Integer> 
			arr = Arrays.asList(3, 2, 5, 7, 4); 

		// Instantiate the ObjIntConsumer interface 
		ObjIntConsumer<List<Integer> > 
			func = (list, num) -> 
		{ 
			list.stream() 
				.forEach( 
					a -> System.out.println(a * num)); 
		}; 
		func.accept(arr, 2); 
	} 
} 
