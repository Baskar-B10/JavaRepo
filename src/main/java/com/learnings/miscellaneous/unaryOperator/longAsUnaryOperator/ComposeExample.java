package com.learnings.miscellaneous.unaryOperator.longAsUnaryOperator;

import java.util.function.LongUnaryOperator;

public class ComposeExample {
	public static void main(String args[]) 
	{ 

		LongUnaryOperator op = a -> a / 3; 

		op = op.compose(a -> a * 6); 

		System.out.println(op.applyAsLong(12)); 
	} 
} 
