package com.program.strings.find;// Importing Files and Classes

class FindUnicodeAtIndexPoint {
//Time Complexity O(n) of the above code.
	// DateWithDifferentLocale driver method
	public static void main(String[] args)
	{
		// Considering random string for input
		String str = "GEEKS";

		// Unicode at index 0
		// Input is a small string
		int result_1 = str.codePointAt(0);
		int result_2 = str.codePointAt(1);
		int result_3 = str.codePointAt(2);
		int result_4 = str.codePointAt(3);
		int result_5 = str.codePointAt(4);

		// Printing the input string
		System.out.println("Original String : " + str);

		// Prints unicode character at index 0 to 4
		// in above input string
		// to show usage of codePointAt()
		System.out.println("unicode point at 0 = "
						+ result_1);
		System.out.println("unicode point at 1 = "
						+ result_2);
		System.out.println("unicode point at 2 = "
						+ result_3);
		System.out.println("unicode point at 3 = "
						+ result_4);
		System.out.println("unicode point at 4 = "
						+ result_5);


		// Try block to check exceptions
		try {

			// Input string
			String str1 = "Geeksforgeeks";

			// unicode at index 0
			// Storing it in integer variable
			int result1 = str1.codePointAt(0);

			// unicode at index 4
			int result2 = str1.codePointAt(-4);

			// Printing input/original string
			System.out.println("Original String : " + str1);

			// Prints unicode character at index 1 in string
			System.out.println("Character(unicode point) = "
					+ result1);

			// Prints unicode character at index 4 in string
			System.out.println("Character(unicode point) = "
					+ result2);
		}

		// Catch block to handle exception
		catch (IndexOutOfBoundsException e) {

			// Message printed if exception occurs
			System.out.println("Exception thrown  :" + e);
		}
	}
}
