package com.learnings.miscellaneous.unaryOperator.longAsUnaryOperator;

import java.util.function.LongUnaryOperator;

public class AndThenNullExample {
	public static void main(String args[]) 
	{ 

		try { 

			LongUnaryOperator op = a -> 2 * a; 

			op = op.andThen(null); 

			System.out.println(op.applyAsLong(12)); 
		} 
		catch (Exception e) { 

			System.out.println("Exception: " + e); 
		} 
	} 
} 
