package com.learnings.basics.regex;// Java program to demonstrate
// Pattern.pattern method

import java.util.regex.*;

public class PatternMethodDemo {
	public static void main(String[] args)
	{

		// create a REGEX String
		String REGEX = "(.*)(ee)(.*)?";

		// create the string
		// in which you want to search
		String actualString = "geeks";

		// create pattern
		Pattern pattern1 = Pattern.compile(REGEX);

		// find the regular expression of pattern
		String RegularExpression = pattern1.pattern();

		System.out.println("Pattern's RegularExpression = "
						+ RegularExpression);
	}
}
