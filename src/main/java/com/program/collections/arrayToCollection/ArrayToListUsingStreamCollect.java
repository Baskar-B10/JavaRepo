package com.program.collections.arrayToCollection;

import static java.util.stream.Collectors.toList;

import java.util.*;
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
