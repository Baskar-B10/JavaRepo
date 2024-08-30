package com.program.exceptions.unChecked;// Importing Classes/Files



// Importing Files/Classes

public class HandleNPEExample {

	// Driver FileSearch Method
	public static void main(String[] args)
	{
		// Assigning NULL to string
		String m = null;

		// Try-Catch Block
		try {

			// Checking the null value with HandleArrayOutOfBoundExample string
			// and throw exception
			if (m.equals("HandleArrayOutOfBoundExample")) {
				// Print String
				System.out.println("YES");
			}
		}

		// Try-Catch Block
		catch (NullPointerException e) {

			// Handles the exception
			System.out.println(
					"Object reference cannot be null");
		}
	}
}