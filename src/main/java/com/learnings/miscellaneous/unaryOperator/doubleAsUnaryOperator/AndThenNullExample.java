package com.learnings.miscellaneous.unaryOperator.doubleAsUnaryOperator;

import java.util.function.DoubleUnaryOperator;

public class AndThenNullExample {
	public static void main(String args[]) 
	{ 

		try { 
			DoubleUnaryOperator op = a -> 2 * a; 

			op = op.andThen(null); 

			System.out.println(op.applyAsDouble(12.0)); 
		} 
		catch (Exception e) { 
			System.out.println("Exception: " + e); 
		} 
	} 
} 
