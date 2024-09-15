package com.learnings.miscellaneous.unaryOperator.doubleAsUnaryOperator;

import java.util.function.DoubleUnaryOperator;

public class ComposeExample {
	public static void main(String args[]) 
	{ 

		DoubleUnaryOperator op = a -> a / 3; 

		op = op.compose(a -> a * 6); 

		System.out.println(op.applyAsDouble(12.0)); 
	} 
} 
