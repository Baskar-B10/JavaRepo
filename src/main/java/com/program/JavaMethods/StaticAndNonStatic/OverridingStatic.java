package com.program.JavaMethods.StaticAndNonStatic;

// Override of static method
class Parent {

	// static method
	static void show()
	{
		System.out.println("Parent");
	}
}

// Parent inherit in Child class
class Child extends Parent {

	// override show() of Parent
	/*void show()
	{
		System.out.println("Child");
	}*/

	/* error: show() in Child cannot override show() in Parent
	void show()
         ^
	overridden method is static*/
}

class OverridingStatic {
	public static void main(String[] args)
	{
		Parent p = new Parent();
		// calling Parent's show()
		p.show();
		// cannot override Parent's show()
	}
}
