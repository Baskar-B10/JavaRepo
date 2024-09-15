package com.learnings.miscellaneous.unaryOperator.doubleAsUnaryOperator;

import java.util.function.DoubleUnaryOperator;

public class AndThenExample {
	public static void main(String args[]) 
	{ 

		DoubleUnaryOperator op = a -> 2 * a; 

		op = op.andThen(a -> 3 * a); 

		System.out.println(op.applyAsDouble(12.0)); 
	} 
} 
