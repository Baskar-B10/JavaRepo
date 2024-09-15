package com.learnings.miscellaneous.unaryOperator.doubleAsUnaryOperator;

import java.util.function.DoubleUnaryOperator;

public class ComposeNullExample {
	public static void main(String args[]) 
	{ 

		try { 
			DoubleUnaryOperator op = a -> a / 3; 

			op = op.compose(null); 

			System.out.println(op.applyAsDouble(12.0)); 
		} 
		catch (Exception e) { 
			System.out.println("Exception: " + e); 
		} 
	} 
} 
