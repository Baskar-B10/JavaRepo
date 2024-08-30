package com.program.classes.polymorphism;// PublicMethods Simple Java program to demonstrate
// Overriding and Access-Modifiers

class ParentClass {
	// private methods are not overridden
	private void m1()
	{
		System.out.println("From parent m1()");
	}

	protected void m2()
	{
		System.out.println("From parent m2()");
	}
}

class ChildClass extends ParentClass {
	// new m1() method
	// unique to Child class
	private void m1()
	{
		System.out.println("From child m1()");
	}

	// overriding method
	// with more accessibility
	@Override public void m2()
	{
		System.out.println("From child m2()");
	}
}

// Driver class
public class MethodOverrideAccessModifier {
	public static void main(String[] args)
	{
		ParentClass obj1 = new ParentClass();
		obj1.m2();
		ParentClass obj2 = new ChildClass();
		obj2.m2();
	}
}
