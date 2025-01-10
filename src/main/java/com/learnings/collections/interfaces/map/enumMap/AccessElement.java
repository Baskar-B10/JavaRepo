package com.learnings.collections.interfaces.map.enumMap;// Java Program to Access the Elements of EnumMap

// Importing required classes 
import java.util.EnumMap; 

// Main class 
// AccessElementsOfEnumMap 
class AccessElement {

	// Enum 
	enum Color { RED, GREEN, BLUE, WHITE } 

	// Main driver method 
	public static void main(String[] args) 
	{ 

		// Creating an EnumMap of the Color enum 
		EnumMap<Color, Integer> colors 
			= new EnumMap<>(Color.class); 

		// Inserting elements using put() method 
		colors.put(Color.RED, 1); 
		colors.put(Color.GREEN, 2); 
		colors.put(Color.BLUE, 3); 
		colors.put(Color.WHITE, 4); 

		System.out.println("EnumMap colors : " + colors); 

		// Using the entrySet() method 
		System.out.println("Key/Value mappings: "
						+ colors.entrySet()); 

		// Using the keySet() method 
		System.out.println("Keys: " + colors.keySet()); 

		// Using the values() method 
		System.out.println("Values: " + colors.values()); 

		// Using the get() method 
		System.out.println("Value of RED : "
						+ colors.get(Color.RED)); 
	} 
}
