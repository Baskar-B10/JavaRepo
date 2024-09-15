package com.learnings.miscellaneous.unaryOperator.intUnaryOperator;

import java.util.function.IntUnaryOperator;

public class ComposeExample {
	public static void main(String args[]) 
	{ 
		IntUnaryOperator op = a -> a / 3; 
		op = op.compose(a -> a * 6); 
		System.out.println(op.applyAsInt(12)); 
	} 
} 
