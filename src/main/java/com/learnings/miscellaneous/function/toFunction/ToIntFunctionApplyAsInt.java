package com.learnings.miscellaneous.function.toFunction;

import java.util.function.ToIntFunction;

public class ToIntFunctionApplyAsInt {
	public static void main(String args[]) 
	{ 

		// Instantiating ToIntFunction 
		ToIntFunction<Double> ob = a -> (int)(a * 10); 

		// Applying the above function 
		// using applyAsInt() 
		System.out.println(ob.applyAsInt(3.2)); 
	} 
} 
