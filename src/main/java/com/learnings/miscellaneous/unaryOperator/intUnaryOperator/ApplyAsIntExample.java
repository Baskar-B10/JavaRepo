package com.learnings.miscellaneous.unaryOperator.intUnaryOperator;

import java.util.function.IntUnaryOperator;

public class ApplyAsIntExample {
	public static void main(String args[]) 
	{ 
		IntUnaryOperator op = a -> 2 * a; 
		System.out.println(op.applyAsInt(12)); 
	} 
} 