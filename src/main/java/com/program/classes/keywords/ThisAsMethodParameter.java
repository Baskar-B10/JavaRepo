package com.program.classes.keywords;

// Java code for using 'this'
// keyword as method parameter
class ThisAsMethodParameter {
	int a;
	int b;

	// Default constructor
	ThisAsMethodParameter()
	{
		a = 10;
		b = 20;
	}

	// Method that receives 'this' keyword as parameter
	void display(ThisAsMethodParameter obj)
	{
		System.out.println("a = " + obj.a
						+ " b = " + obj.b);
	}

	// Method that returns current class instance
	void get() { display(this); }

	// main function
	public static void main(String[] args)
	{
		ThisAsMethodParameter object = new ThisAsMethodParameter();
		object.get();
	}
}
