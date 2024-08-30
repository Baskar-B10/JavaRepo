package com.program.strings.replace;// Java program to Remove leading/preceding
// zeros from a given String

// Importing required classes
//Time Complexity: O(n), where n is the length of the input string ‘str’. The algorithm performs a single loop through the length of the string to find the first non-zero character.
//Auxiliary Space Complexity: O(n), where n is the length of the input string ‘str’. The algorithm requires a string variable ‘newstr’ to store the modified string without leading zeros.
class ReplaceLeadingZerosUsingSubString {

	public static void main(String[] args)
	{

		// Sample string input
		String str = "00000123569";
		String newstr = "";
		int ind = 0;
		for (int i = 0; i < str.length(); i++) {
			char p = str.charAt(i);
			if (p != '0') {
				ind = i;
				break;
			}
		}
		newstr = str.substring(ind, str.length());
		// Printing leading zeros inside string
		System.out.println(newstr);
	}
}
