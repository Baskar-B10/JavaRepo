package com.learnings.miscellaneous.consumer.longConsumer;

import java.util.function.LongConsumer;

public class AndThenException {
	public static void main(String args[])
	{

		try {
			LongConsumer divide = a -> a = a / (a - 3);
			LongConsumer mul = a -> a *= 10;
			LongConsumer composite = mul.andThen(divide);
			composite.accept(3);
		}
		catch (Exception e) {
			System.out.println("Exception : " + e);
		}
	}
}
