package com.learnings.miscellaneous.unaryOperator.intUnaryOperator;

import java.util.function.IntUnaryOperator;

public class AndThenExample {
	public static void main(String args[]) 
	{ 
		IntUnaryOperator op = a -> 2 * a; 
		op = op.andThen(a -> 3 * a); 
		System.out.println(op.applyAsInt(12)); 
	} 
} 
