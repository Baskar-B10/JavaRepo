package com.program.classes.abstractClasses;// Java Program to illustrate Abstract class
// Without any abstract method

// Class 1
// An abstract class without any abstract method
abstract class Base5 {

	// Demo method. This is not an abstract method.
	void fun()
	{
		// Print message if class 1 function is called
		System.out.println(
			"Function of Base class is called");
	}
}

// Class 2
class Derived5 extends Base5 {
	// This class only inherits the Base class methods and
	// properties
}

// Class 3
class AbstractClassWithoutMethod {

	// OverloadingMain driver method
	public static void main(String args[])
	{
		// Creating object of class 2
		Derived5 d = new Derived5();

		// Calling function defined in class 1 inside main()
		// with object of class 2 inside main() method
		d.fun();
	}
}
