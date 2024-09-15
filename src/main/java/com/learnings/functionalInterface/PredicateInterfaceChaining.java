package com.learnings.functionalInterface;// Java program to illustrate Predicate Chaining

import java.util.function.Predicate; 
public class PredicateInterfaceChaining {
	public static void main(String[] args) 
	{ 
		Predicate<Integer> greaterThanTen = (i) -> i > 10; 

		// Creating predicate 
		Predicate<Integer> lowerThanTwenty = (i) -> i < 20; 
		boolean result = greaterThanTen.and(lowerThanTwenty).test(15); 
		System.out.println(result); 

		// Calling Predicate method
		//Greater than 10 and less than 20 -->true and negate -->opposite to True
		boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15); 
		System.out.println(result2); 
	} 
} 
