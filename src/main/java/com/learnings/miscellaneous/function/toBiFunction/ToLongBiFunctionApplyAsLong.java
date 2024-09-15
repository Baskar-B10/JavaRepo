package com.learnings.miscellaneous.function.toBiFunction;

import java.util.function.ToLongBiFunction;

public class ToLongBiFunctionApplyAsLong {
	public static void main(String args[]) 
	{ 
		ToLongBiFunction<Integer, String> 
			ob = (a, b) -> a + Integer.parseInt(b) * 1000000; 

		// Using applyAsLong() method 
		System.out.println(ob.applyAsLong(3, "10")); 
	} 
} 
