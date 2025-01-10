package com.learnings.basics.regex;// Java program explaining Character class methods
// charCount(), charValue(), codePointat()
import java.lang.Character;
public class CharacterMethodsDemo1 {
	public static void main(String[] args)
	{
		// Use of charCount() method
		int geek = 0x9999, // < 0x10000
			geek1 = 0x10000, // = 0x10000
			geek2 = 0x10001; // > 0x10000

		int check = Character.charCount(geek);
		int check1 = Character.charCount(geek1);
		int check2 = Character.charCount(geek2);

		if (check == 2) // Checking for geek
			System.out.println("Valid Character geek");
		else
			System.out.println("Invalid Character geek");

		if (check1 == 2) // Checking for geek1
			System.out.println("Valid Character geek1");
		else
			System.out.println("Invalid Character geek1");

		if (check2 == 2) // Checking for geek2
			System.out.println("Valid Character geek2");
		else
			System.out.println("Invalid Character geek2");

		System.out.println("");

		// Use of charValue() method
		Character m; // Character object m

		m = new Character('g'); // Assigning value g to m;

		char gfg;
		gfg = m.charValue();
		System.out.println("Primitive value of gfg : "
						+ gfg);
		System.out.println("");

		// Use of codePointAt()
		char[] arg = new char[] { 'g', 'e', 'e', 'k', 's' };
		int val, val1, position = 3;

		val = Character.codePointAt(arg, position);
		val1 = Character.codePointAt(arg, 0);

		System.out.println("Unicode code point at "
						+ position + " : " + val);
		System.out.println("Unicode code point at 0 : "
						+ val1);
	}
}
