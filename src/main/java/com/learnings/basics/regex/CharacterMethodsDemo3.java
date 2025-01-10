package com.learnings.basics.regex;// Java program explaining Character class methods
// equals(), getNumericValue(), getType()
import java.lang.Character;
public class CharacterMethodsDemo3
{
	public static void main(String[] args)
	{
		// Use of equals() method
		Character g1 = new Character('g');
		Character g2 = new Character('O');

		boolean check = g1.equals(g2);
		boolean check1 = g1.equals(g1);
		System.out.println("Are g and o equal? : " + check);
		System.out.println("Are g and g equal? : " + check1);
		System.out.println("");

		// Use of getNumericValue() method
		int c = Character.getNumericValue(g1);
		int c1 = Character.getNumericValue(g2);
		System.out.println("Int value for g : " + c);
		System.out.println("Int value for A : " + c1);
		System.out.println("");

		// Use of getType() method
		Character g3 = new Character('$');
		Character g4 = new Character('6');

		int r1 = Character.getType(g1);
		int r2 = Character.getType(g2);
		int r3 = Character.getType(g3);
		int r4 = Character.getType(g4);

		System.out.println("Type for lowercase : " + r1);
		System.out.println("Type for uppercase : " + r2);
		System.out.println("Type for currency : " + r3);
		System.out.println("Type for numeric : " + r4);
	}
}
