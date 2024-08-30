package com.program.collections.methods;// Java program to convert Collections into Array

// Importing generic Java libraries
import java.util.*;
import java.io.*;

public class CollectionToArrayForGivenInput {

	// FileSearch driver code
	public static void main(String[] args)
	{
		// Reading input from the user
		// via BufferedReader class
		BufferedReader in = new BufferedReader(
			new InputStreamReader(System.in));
		// 'in' is object created of this class
int count =0;
		// Creating object of Scanner class
		Scanner sc = new Scanner(System.in);

		// Creating ArrayList to store user input
		List<String> list = new ArrayList<String>();

		// Taking input from user
		// adding elements to the list
		while (sc.hasNext() && count ==3) {
			String i = sc.nextLine();
			count++;
			list.add(i);
		}

		// Converting list to an array
		String[] str = list.toArray(new String[0]);

		// Iteration over array
		for (int i = 0; i < str.length; i++) {
			String data = str[i];

			// Printing the elements
			System.out.print(data);
		}
	}
}
