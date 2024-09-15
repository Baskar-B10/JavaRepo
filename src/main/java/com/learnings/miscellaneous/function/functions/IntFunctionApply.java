package com.learnings.miscellaneous.function.functions;

import java.util.function.IntFunction;

public class IntFunctionApply {
	public static void main(String args[]) 
	{ 
		IntFunction<Double> ob = a -> a / 2.0; 

		// Using apply() method 
		System.out.println(ob.apply(3)); 
	} 
} 
