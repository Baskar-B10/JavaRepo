package com.learnings.streamAPI.basics.Introduction;// Java program to understand execution
// of sequential streams 

import java.util.*;

class SequentialStreamDemo { 
	
	public static void main(String[] args) 
	{ 
		// create a list 
		List<String> list = Arrays.asList( "Hello ", 
						"G", "E", "E", "K", "S!"); 

		// we are using stream() method 
		// for sequential stream 
		// Iterate and print each element 
		// of the stream 
		list.stream().forEach(System.out::print); 
	} 
}
