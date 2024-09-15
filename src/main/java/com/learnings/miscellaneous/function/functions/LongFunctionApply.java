package com.learnings.miscellaneous.function.functions;

import java.util.function.LongFunction;

public class LongFunctionApply {
	public static void main(String args[]) 
	{ 

		LongFunction<Double> ob = a -> a / 2.0; 

		// Using apply() 
		System.out.println(ob.apply(3)); 
	} 
} 
