package com.learnings.miscellaneous.consumer.doubleConsumer;

import java.util.function.DoubleConsumer;

public class AndThenNPE {
	public static void main(String args[])
	{

		// Create a DoubleConsumer Instance
		DoubleConsumer mul = a -> a /= 10;

		try {

			// using addThen() method
			DoubleConsumer composite = mul.andThen(null);

			composite.accept(3);
		}
		catch (Exception e) {
			System.out.println("Exception : " + e);
		}
	}
}
