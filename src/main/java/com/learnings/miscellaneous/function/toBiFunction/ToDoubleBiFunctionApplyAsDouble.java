package com.learnings.miscellaneous.function.toBiFunction;

import java.util.function.ToDoubleBiFunction;

public class ToDoubleBiFunctionApplyAsDouble {
	public static void main(String args[]) 
	{ 

		ToDoubleBiFunction<Integer, String> 
			ob = (a, b) -> a + Integer.parseInt(b) * 3.2; 

		// Using applyAsDouble() 
		System.out.println(ob.applyAsDouble(3, "10")); 
	} 
} 
