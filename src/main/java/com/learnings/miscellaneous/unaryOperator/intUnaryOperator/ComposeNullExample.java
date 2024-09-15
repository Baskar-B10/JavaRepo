package com.learnings.miscellaneous.unaryOperator.intUnaryOperator;

import java.util.function.IntUnaryOperator;

public class ComposeNullExample {
	public static void main(String args[]) 
	{ 
		IntUnaryOperator op = a -> a / 3; 
		op = op.compose(null); 
		System.out.println(op.applyAsInt(12)); 
	} 
} 
