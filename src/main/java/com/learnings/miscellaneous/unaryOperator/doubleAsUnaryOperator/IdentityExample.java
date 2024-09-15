package com.learnings.miscellaneous.unaryOperator.doubleAsUnaryOperator;

import java.util.function.DoubleUnaryOperator;

public class IdentityExample {
	public static void main(String args[]) 
	{ 
		DoubleUnaryOperator 
			op 
			= DoubleUnaryOperator.identity(); 

		System.out.println(op.applyAsDouble(12.0)); 
	} 
} 
