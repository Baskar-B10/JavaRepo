package com.learnings.miscellaneous.consumer.intConsumer;

import java.util.function.IntConsumer;

public class AndThenException {
	public static void main(String args[])
	{

		try {
			// Create a IntConsumer Instance
			IntConsumer divide = a -> a = a / (a - 3);
			IntConsumer mul = a -> a *= 10;
			IntConsumer composite = mul.andThen(divide);
			composite.accept(3);
		}

		catch (Exception e) {
			System.out.println("Exception : " + e);
		}
	}
}
