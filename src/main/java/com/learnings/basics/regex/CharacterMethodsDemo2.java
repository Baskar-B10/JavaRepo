package com.learnings.basics.regex;// Java program explaining Character class methods
// codePointBefore(), codePointCount(), compareTo()
import java.lang.Character;
public class CharacterMethodsDemo2
{
	public static void main(String[] args)
	{
		// Use of codePointBefore()
		char[] arg = new char[] { 'g', 'e', 'e', 'k', 's' };
		int position = 4;

		int val = Character.codePointBefore(arg, position);
		int val1 = Character.codePointBefore(arg, 1);
		int val2 = Character.codePointBefore(arg, 3, 1);

		System.out.println( "Unicode code point before " + position +
													" : " + val );
		System.out.println( "Unicode code point before 1 : " + val1 );
		System.out.println( "Unicode code point before 3 to 1 : "
															+ val2);
		System.out.println("");

		// Use of codePointCount()
		int count = Character.codePointCount(arg, 1,3 );

		System.out.println("No. of Unicode points : " + count);
		System.out.println("");

		// Use of compareTo()
		Character g1 = new Character('g');
		Character g2 = new Character('o');

		int check = g1.compareTo(g2);
		System.out.println("g1 < g2 : " + check);
		int check1 = g2.compareTo(g1);
		System.out.println("g2 > g1 : " + check1);
		int check2 = g2.compareTo(g2);
		System.out.println("g2 = g2 : " + check2);
	}
}
