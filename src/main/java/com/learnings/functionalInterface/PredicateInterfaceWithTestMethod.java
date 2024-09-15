package com.learnings.functionalInterface;// Java program to illustrate Simple Predicate

import java.util.function.Predicate; 
public class PredicateInterfaceWithTestMethod {
	public static void main(String[] args) 
	{ 
		// Creating predicate 
		Predicate<Integer> lesserthan = i -> (i < 18); 

		// Calling Predicate method 
		System.out.println(lesserthan.test(10)); 
	} 
} 
