package com.learnings.miscellaneous.unaryOperator.intUnaryOperator;

import java.util.function.IntUnaryOperator;

public class AndThenNullExample {
	public static void main(String args[]) 
	{ 
		IntUnaryOperator op = a -> 2 * a; 
		op = op.andThen(null); 
		System.out.println(op.applyAsInt(12)); 
	} 
} 
