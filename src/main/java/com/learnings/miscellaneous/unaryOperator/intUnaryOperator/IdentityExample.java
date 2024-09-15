package com.learnings.miscellaneous.unaryOperator.intUnaryOperator;

import java.util.function.IntUnaryOperator;

public class IdentityExample {
	public static void main(String args[]) 
	{ 
		IntUnaryOperator op = IntUnaryOperator.identity(); 
		System.out.println(op.applyAsInt(12)); 
	} 
} 
