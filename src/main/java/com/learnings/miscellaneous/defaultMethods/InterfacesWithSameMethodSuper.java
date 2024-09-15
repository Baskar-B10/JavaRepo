package com.learnings.miscellaneous.defaultMethods;// Java program to demonstrate the case
// when two interfaces are overridden

// Creating Interface One
interface Interfaces1{
public default void display()
{
	System.out.println("GEEKSFORGEEKS");
}
}

// Creating Interface Two
interface Interfaces2{

public default void display() 
{
	System.out.println("geeksforgeeks");
}
}

public class InterfacesWithSameMethodSuper implements Interfaces1,Interfaces2 {

// Interfaces are Overrided
public void display() {

	Interfaces1.super.display();

	Interfaces2.super.display();
}

public static void main(String args[]) {
	InterfacesWithSameMethodSuper obj = new InterfacesWithSameMethodSuper();
	obj.display();
}
}
