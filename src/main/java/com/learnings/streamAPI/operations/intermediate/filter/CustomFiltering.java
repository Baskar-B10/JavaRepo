package com.learnings.streamAPI.operations.intermediate.filter;// Java program to demonstrate
// filter by Custom Properties 

import java.util.ArrayList;
import java.util.List;

class Employee {

	// attributes of an Employee
	String name;
	int age;

	// constructor
	Employee(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	// Override toString to print
	// provided content when an Object
	// is printed
	@Override public String toString()
	{
		return "Employee [name=" + name + "]";
	}
}



public class CustomFiltering {

	// Employee class 

	public static void main(String[] args) 
	{
		List<Employee> myList = new ArrayList<Employee>();

		myList.add( new Employee("Ram", 25));
		myList.add( new Employee("Kumar", 40));
		myList.add( new Employee("Rakesh", 35));
		// create a stream on the list
		// filter by age of an employee
		myList.stream()
				.filter(x -> x.age >= 35)
				.forEach(System.out::println);
	} 
}
