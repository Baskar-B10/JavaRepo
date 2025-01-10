package com.learnings.collections.interfaces.map.enumMap;// Java Program to Add Elements to the EnumMap

// Importing EnumMap class 
import java.util.EnumMap; 

// Main class 
// AddingElementsToEnumMap 
class AddElement {

	enum Color { RED, GREEN, BLUE, WHITE } 
	public static void main(String[] args) 
	{ 

		// Creating an EnumMap of the Color enum 
		EnumMap<Color, Integer> colors1 
			= new EnumMap<>(Color.class); 

		// Insert elements in Map 
		// using put() method 
		colors1.put(Color.RED, 1); 
		colors1.put(Color.GREEN, 2); 

		// Printing mappings to the console 
		System.out.println("EnumMap colors1: " + colors1); 

		// Creating an EnumMap of the Color Enum 
		EnumMap<Color, Integer> colors2 
			= new EnumMap<>(Color.class); 

		// Adding elements using the putAll() method 
		colors2.putAll(colors1); 
		colors2.put(Color.BLUE, 3); 

		// Printing mappings to the console 
		System.out.println("EnumMap colors2: " + colors2); 
	} 
}
