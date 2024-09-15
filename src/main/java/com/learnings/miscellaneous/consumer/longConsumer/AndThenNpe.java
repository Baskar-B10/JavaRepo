package com.learnings.miscellaneous.consumer.longConsumer;

import java.util.function.LongConsumer;

public class AndThenNpe {
	public static void main(String args[])
	{

		try {

			LongConsumer mul = a -> a *= 10;
			LongConsumer composite = mul.andThen(null);
			composite.accept(3);
		}
		catch (Exception e) {
			System.out.println("Exception : " + e);
		}
	}
}
