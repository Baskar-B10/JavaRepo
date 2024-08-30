package com.program.classes.abstractClasses;// Java Program to Illustrate
// that an instance of Abstract
// Class can not be created

// Class 1
// Abstract class
abstract class BaseClass {
	abstract void fun();
}

// Class 2
class Derived extends BaseClass {
	void fun()
	{
		System.out.println("Derived fun() called");
	}
}

// Class 3
// OverloadingMain class
class AbstractClass {

	// OverloadingMain driver method
	public static void main(String args[])
	{

		// Uncommenting the following line will cause
		// compiler error as the line tries to create an
		// instance of abstract class. Base b = new Base();

		// We can have references of Base type.
		BaseClass b = new Derived();
		b.fun();
		BaseClass c= new BaseClass() {
			@Override
			void fun() {
				System.out.println("Base class override ");
			}
		};
		c.fun();


	}
}
