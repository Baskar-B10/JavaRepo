package com.program.exceptions.checked;// Java Program to Handle Checked Exception

// Class 
class HandleClassNotFoundExceptionExample {

	// FileSearch driver method
	public static void main(String[] args)
		throws ClassNotFoundException
	{
		// Try block to check for exceptions
		try {
			Class temp = Class.forName(
				"gfg"); // calling the gfg class
		}
	
	// Catch block to handle the exceptions
		catch (ClassNotFoundException e) {
		
			// block executes when mention exception occur
			System.out.println(
				"Class does not exist check the name of the class");
		}
	}
}
