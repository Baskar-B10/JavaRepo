package com.learnings.miscellaneous.defaultMethods;

// Creating Interface
interface InterfaceWithDefaultMethod{

public default void display() {
	System.out.println("GEEKSFORGEEKS");
}
}

// LongToIntFunctionApplyAsInt Class With Implementation Of Interface
public class InterfaceWithDefaultMethodExample implements InterfaceWithDefaultMethod{
public static void main(String args[]) {
	InterfaceWithDefaultMethodExample obj = new InterfaceWithDefaultMethodExample();
	
	// Calling Interface
	obj.display(); 
}
}
