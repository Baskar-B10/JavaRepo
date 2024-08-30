package com.program.JavaMethods.StaticAndNonStatic;// Override of non-static method

class ParentClass {
	void show()
	{
		System.out.println("Parent");
	}
}

// Parent inherit in Child class
class ChildClass extends ParentClass {

	// override show() of Parent
	void show()
	{
		System.out.println("Child");
	}
}

public class OverridingNonStatic {
	public static void main(String[] args)
	{
		ParentClass p = new ParentClass();
		// calling Parent's show()
		p.show();

		ParentClass c = new ChildClass();
		// calling Child's show()
		c.show();
	}
}
