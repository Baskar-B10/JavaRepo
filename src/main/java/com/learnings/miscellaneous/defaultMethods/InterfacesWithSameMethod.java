package com.learnings.miscellaneous.defaultMethods;// Java program to demonstrate the case when
// two interfaces are not overridden

// Creating Interface One
interface Interface1{
public default void display() {
	System.out.println("GEEKSFORGEEKS");
}
}

// Creating Interface Two
interface Interface2{

public default void display() {
	System.out.println("geeksforgeeks");
}
}

// Interfaces are not Overridden 
public class InterfacesWithSameMethod implements Interface1{ //,Interface2 {
public static void main(String args[])
{
	InterfacesWithSameMethod obj = new InterfacesWithSameMethod();
	obj.display();
}
}
