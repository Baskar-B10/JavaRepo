package com.program.classes.abstractClasses;// Java Program to Illustrate Abstract Class
// Can contain Constructors

// Class 1
// Abstract class
abstract class Base4 {

	// Constructor of class 1
	Base4()
	{
		// Print statement
		System.out.println("Base Constructor Called");
	}

	// Abstract method inside class1
	abstract void fun();
}

// Class 2
class Derived4 extends Base4 {

	// Constructor of class2
	Derived4()
	{
		System.out.println("Derived Constructor Called");
	}

	// Method of class2
	void fun()
	{
		System.out.println("Derived fun() called");
	}
}

// Class 3
// OverloadingMain class
class AbstractClassConstructor {

	// OverloadingMain driver method
	public static void main(String args[])
	{
		// Creating object of class 2
		// inside main() method
		Derived4 d = new Derived4();
		d.fun();
	}
}
