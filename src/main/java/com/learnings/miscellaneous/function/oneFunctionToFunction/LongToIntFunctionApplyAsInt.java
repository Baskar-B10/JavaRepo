package com.learnings.miscellaneous.function.oneFunctionToFunction;// Java Program to demonstrate
// LongToIntFunction's applyAsInt() method 

import java.util.function.LongToIntFunction; 

public class LongToIntFunctionApplyAsInt {
	public static void main(String args[]) 
	{ 

		// Instantiating LongToIntFunction 
		LongToIntFunction ob = a -> (int)a * 100000; 

		// Applying the above function 
		// using applyAsInt() 
		System.out.println(ob.applyAsInt(2)); 
	} 
} 
