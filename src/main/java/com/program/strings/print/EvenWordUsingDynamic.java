package com.program.strings.print;
//Time complexity: O(n) where n is length of given string
//Auxiliary Space: O(n) where n is the total number of characters in the input string.
class EvenWordUsingDynamic {
	public static void printWords(String s) {

		// Split string into words
		String[] words = s.split(" ");

		// Create an array to store the length of each word
		int[] wordLengths = new int[words.length];

		// Calculate the length of each word and store in the array
		for (int i = 0; i < words.length; i++) {
			wordLengths[i] = words[i].length();
		}

		// Check if the length of each word is even and print if true
		for (int i = 0; i < words.length; i++) {
			if (wordLengths[i] % 2 == 0) {
				System.out.println(words[i]);
			}
		}
	}

	// Driver code
	public static void main(String[] args) {

		String s = "i am Geeks for Geeks and a Geek";
		printWords(s);
	}
}
