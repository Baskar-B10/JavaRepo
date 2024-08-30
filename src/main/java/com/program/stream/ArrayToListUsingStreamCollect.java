package com.program.stream;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

class ArrayToListUsingStreamCollect {
	public static void main(String[] args)
	{
		String countryArray[]
			= { "India", "Pakistan", "Afganistan",
				"Srilanka" };

		List<String> countryList
			= Arrays.stream(countryArray).collect(toList());

		System.out.println("Converted ArrayList elements: "
						+ countryList);
	}
}
