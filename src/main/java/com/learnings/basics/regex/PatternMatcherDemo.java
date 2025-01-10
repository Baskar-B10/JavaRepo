package com.learnings.basics.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherDemo {

	public static void main(String[] args)
	{
		String input1
			= "The quick brown fox jumps over the lazy dog";
		String input2
			= "The quick red fox jumps over the lazy dog";
		String regex = "(?i)the";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher1 = pattern.matcher(input1);
		Matcher matcher2 = pattern.matcher(input2);
		while (matcher1.find()) {
			System.out.println("Match 1: "
							+ matcher1.group());
		}
		while (matcher2.find()) {
			System.out.println("Match 2: "
							+ matcher2.group());
		}
	}
}
