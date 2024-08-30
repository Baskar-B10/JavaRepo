package com.program.JavaMethods.majorMethods;// Java program to demonstrate
// forEach(BiConsumer) method.

import java.util.*;

public class ToStringInStringBuilder {

	// DateWithDifferentLocale method
	public static void main(String[] args)
	{

		// create a table and add some values
		Map<Integer, String>
			table = new Hashtable<>();

		table.put(1, "100RS");
		table.put(2, "500RS");
		table.put(3, "1000RS");

		try {

			// add 100 in each value using forEach()
			table.forEach((k, v) -> {

				v = v + 100;
				table.put(null, v);
			});
		}
		catch (Exception e) {

			System.out.println("Exception: " + e);
		}
	}
}
