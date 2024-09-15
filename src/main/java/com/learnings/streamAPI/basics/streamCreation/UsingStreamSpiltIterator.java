package com.learnings.streamAPI.basics.streamCreation;// Java program to create StreamDemo from Collections

import java.util.*;
import java.util.regex.Pattern;

class UsingStreamSpiltIterator {

	// Function convert a List into StreamDemo
	private static void
	getStream(List<String> list, Pattern p) 
	{ 

		list.stream() 
			.filter(p.asPredicate()) 
			.forEach(System.out::println); 
	} 

	public static void main(String[] args) 
	{ 

		// Create ArrayList of String 
		// that is backed by the specified array 
		List<String> list 
			= Arrays 
				.asList("Geeks", 
						"For", 
						"TemporalAdjusterDemo",
						"GeeksForGeeks", 
						"A Computer Portal"); 

		// Get the pattern 
		Pattern p = Pattern.compile("^G"); 

		// Get the StreamDemo from the List matching Pattern
		getStream(list, p); 
	} 
} 
