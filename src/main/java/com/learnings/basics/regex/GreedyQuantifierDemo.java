package com.learnings.basics.regex;// Java program to demonstrate Greedy Quantifiers

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class GreedyQuantifierDemo
{
	public static void main(String[] args)
	{
		// Making an instance of Pattern class
		// By default quantifier "+" is Greedy
		Pattern p = Pattern.compile("g+");

		// Making an instance of Matcher class
		Matcher m = p.matcher("ggg");

		while (m.find())
			System.out.println("Pattern found from " + m.start() +
							" to " + (m.end()-1));

	}
}
