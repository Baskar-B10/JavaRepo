package com.learnings.collections.interfaces.map.enumMap;// Java program to Remove Elements of EnumMap

// Importing EnumMap class 
import java.util.EnumMap; 

// Main class 
class RemoveElement {

	// Enum 
	enum Color { 

		// Custom elements 
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

		// Inserting elements in the Map 
		// using put() method 
		colors.put(Color.RED, 1); 
		colors.put(Color.GREEN, 2); 
		colors.put(Color.BLUE, 3); 
		colors.put(Color.WHITE, 4); 

		// Printing colors in the EnumMap 
		System.out.println("EnumMap colors : " + colors); 

		// Removing a mapping 
		// using remove() Method 
		int value = colors.remove(Color.WHITE); 

		// Displaying the removed value 
		System.out.println("Removed Value: " + value); 

		// Removing specific color and storing boolean 
		// if removed or not 
		boolean result = colors.remove(Color.RED, 1); 

		// Printing the boolean result whether removed or 
		// not 
		System.out.println("Is the entry {RED=1} removed? "
						+ result); 

		// Printing the updated Map to the console 
		System.out.println("Updated EnumMap: " + colors); 
	} 
}
