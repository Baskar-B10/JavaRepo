package com.learnings.miscellaneous.unaryOperator.longAsUnaryOperator;

import java.util.function.LongUnaryOperator;

public class ApplyAsLongExample {
	public static void main(String args[]) 
	{ 

		LongUnaryOperator 
			op 
			= a -> 2 * a; 

		System.out.println(op.applyAsLong(12)); 
	} 
} 
