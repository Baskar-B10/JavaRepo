package com.program.classes.abstractClasses;// Java Program to Illustrate Abstract classes
// Can also have Final Methods

// Class 1
// Abstract class
abstract class Base6 {

	final void fun()
	{
		System.out.println("Base fun() called");
	}
}

// Class 2
class Derived6 extends Base6 {

}

// Class 3
// OverloadingMain class
class AbstractClassFinalMethod {

	// OverloadingMain driver method
	public static void main(String args[])
	{
		{
			// Creating object of abstract class

			Base6 b = new Derived6();
			// Calling method on object created above
			// inside main method

			b.fun();
		}
	}
}
