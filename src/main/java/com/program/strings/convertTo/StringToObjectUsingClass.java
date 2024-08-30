package com.program.strings.convertTo;// Java program to convert the string to an object

class StringToObjectUsingClass {
	public static void main(String[] args) throws Exception 
	{ 
		// getting the instance of the class passed in 
		// forName method as a string 
		Class c = Class.forName("java.lang.String"); 
		
		// getting the name of the class 
		System.out.println("class name: " + c.getName()); 
		
		// getting the name of the super class 
		System.out.println("super class name: "
						+ c.getSuperclass().getName()); 
	} 
}
