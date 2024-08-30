package com.program.classes.abstractClasses;// Java Program to Illustrate
// Static Methods in Abstract
// Class Can be called Independently

// Class 1
// Abstract class
abstract class Helper {

	// Abstract method
	static void demofun()
	{

		// Print statement
		System.out.println("Geeks for Geeks");
	}
}

// Class 2
// OverloadingMain class extending Helper class
public class AbstractClassStaticMethod extends Helper {

	// OverloadingMain driver method
	public static void main(String[] args)
	{

		// Calling method inside main()
		// as defined in above class
		Helper.demofun();
	}
}
