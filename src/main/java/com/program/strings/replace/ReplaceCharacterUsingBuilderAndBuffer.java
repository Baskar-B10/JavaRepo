package com.program.strings.replace;// Java Program to replace character in
// a String using StringBuffer

// Driver Class
public class ReplaceCharacterUsingBuilderAndBuffer {
	// main function
	public static void main(String args[])
	{
		// Get the String
		String str = "Geeks Gor Geeks";

		// Get the index
		int index = 6;

		// Get the character
		char ch = 'F';

		// Print the original string
		System.out.println("Original String = " + str);

		StringBuilder stringbuilder = new StringBuilder(str);
		stringbuilder.setCharAt(index, ch);

		// Print the modified string
		System.out.println("Modified String = " + stringbuilder);


		StringBuffer stringBuffer = new StringBuffer(str);
		stringBuffer.setCharAt(index, ch);

		// Print the modified string
		System.out.println("Modified String = " + stringBuffer);
	}
}
