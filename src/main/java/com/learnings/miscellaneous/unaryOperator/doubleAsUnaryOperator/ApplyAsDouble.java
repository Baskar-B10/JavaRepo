package com.learnings.miscellaneous.unaryOperator.doubleAsUnaryOperator;

import java.util.function.DoubleUnaryOperator;

public class ApplyAsDouble {
	public static void main(String args[]) 
	{ 
		DoubleUnaryOperator op = a -> 2 * a; 

		System.out.println(op.applyAsDouble(12.0)); 
	} 
} 
