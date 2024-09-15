package com.learnings.miscellaneous.unaryOperator.longAsUnaryOperator;

import java.util.function.LongUnaryOperator;

public class AndThenExample {
	public static void main(String args[]) 
	{ 

		LongUnaryOperator op = a -> 2 * a; 

		op = op.andThen(a -> 3 * a); 

		System.out.println(op.applyAsLong(12)); 
	} 
} 
