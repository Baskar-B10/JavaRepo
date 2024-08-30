package com.program.classes.keywords;

// Java code for using this to invoke current
// class method
class ThisAsClassMethod {

	void display()
	{
		// calling function show()
		this.show();

		System.out.println("Inside display function");
	}

	void show()
	{
		System.out.println("Inside show function");
	}

	public static void main(String args[])
	{
		ThisAsClassMethod t1 = new ThisAsClassMethod();
		t1.display();
	}
}
