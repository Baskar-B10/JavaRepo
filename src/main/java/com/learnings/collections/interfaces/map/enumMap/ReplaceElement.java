package com.learnings.collections.interfaces.map.enumMap;// Java Program to Replace Elements of EnumMap

// Importing required classes 
import java.util.EnumMap; 

// Main class 
class ReplaceElement {

	// Enum 
	enum Color { 

		RED, 
		GREEN, 
		BLUE, 
		WHITE 
	} 

	// Main driver method 
	public static void main(String[] args) 
	{ 

		// Creating an EnumMap of the Color enum 
		EnumMap<Color, Integer> colors 
			= new EnumMap<>(Color.class); 

		// Inserting elements to Map 
		// using put() method 
		colors.put(Color.RED, 1); 
		colors.put(Color.GREEN, 2); 
		colors.put(Color.BLUE, 3); 
		colors.put(Color.WHITE, 4); 

		// Printing all elements inside above Map 
		System.out.println("EnumMap colors " + colors); 

		// Replacing certain elements depicting colors 
		// using the replace() method 
		colors.replace(Color.RED, 11); 
		colors.replace(Color.GREEN, 2, 12); 

		// Printing the updated elements (colors) 
		System.out.println("EnumMap using replace(): "
						+ colors); 

		// Replacing all colors using the replaceAll() 
		// method 
		colors.replaceAll((key, oldValue) -> oldValue + 3); 

		// Printing the elements of above Map 
		System.out.println("EnumMap using replaceAll(): "
						+ colors); 
	} 
}
