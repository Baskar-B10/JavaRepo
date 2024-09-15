package com.learnings.miscellaneous.unaryOperator.longAsUnaryOperator;

import java.util.function.LongUnaryOperator;

public class ComposeNullExample {
	public static void main(String args[]) 
	{ 

		try { 

			LongUnaryOperator op = a -> a / 3; 

			op = op.compose(null); 

			System.out.println(op.applyAsLong(12)); 
		} 
		catch (Exception e) { 

			System.out.println("Exception: " + e); 
		} 
	} 
} 
