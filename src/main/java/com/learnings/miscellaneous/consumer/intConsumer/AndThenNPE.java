package com.learnings.miscellaneous.consumer.intConsumer;

import java.util.function.IntConsumer;

public class AndThenNPE {
	public static void main(String args[])
	{

		try {

			// Create a IntConsumer Instance
			IntConsumer mul = a -> a *= 10;
			IntConsumer composite = mul.andThen(null);
			composite.accept(3);
		}
		catch (Exception e) {
			System.out.println("Exception : " + e);
		}
	}
}
