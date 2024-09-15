package com.learnings.miscellaneous.unaryOperator.longAsUnaryOperator;

import java.util.function.LongUnaryOperator;

public class IdentityExample {
	public static void main(String args[]) 
	{ 
		LongUnaryOperator 
			op 
			= LongUnaryOperator.identity(); 

		System.out.println(op.applyAsLong(12)); 
	} 
} 
