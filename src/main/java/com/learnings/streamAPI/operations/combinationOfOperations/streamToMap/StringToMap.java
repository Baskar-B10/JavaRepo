package com.learnings.streamAPI.operations.combinationOfOperations.streamToMap;// Program to convert
// the StreamDemo to Map

import java.util.stream.*;
import java.util.Arrays; 
import java.util.Map; 

class StringToMap {

	// Function to convert the string 
	// to the map 
	public static Map toMap(String input) 
	{ 
		Map<String, Integer> lengthMap 
			= Arrays.stream(input.split(" ")) 
				.collect(Collectors.toMap( 
					value 
					-> value, 
					value -> value.length())); 

		return lengthMap; 
	} 
	public static void main(String[] args) 
	{ 
		String input = "Geeks for TemporalAdjusterDemo";

		System.out.println(toMap(input)); 
	} 
} 
