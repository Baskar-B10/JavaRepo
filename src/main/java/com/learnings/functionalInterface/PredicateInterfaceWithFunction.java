package com.learnings.functionalInterface;// Java program to illustrate
// passing Predicate into function 

import java.util.function.Predicate; 
class PredicateInterfaceWithFunction {
	static void pred(int number, Predicate<Integer> predicate) 
	{ 
		if (predicate.test(number)) { 
			System.out.println("Number " + number); 
		} 
	} 
	public static void main(String[] args) 
	{ 
		pred(10, (i) -> i > 7); 
	} 
} 
