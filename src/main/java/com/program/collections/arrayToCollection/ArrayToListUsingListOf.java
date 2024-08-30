package com.program.collections.arrayToCollection;

import java.util.*;

class ArrayToListUsingListOf {
	public static void main(String[] args)
	{
		String countryArray[]
			= { "India", "Pakistan", "Afganistan",
				"Srilanka" };

		List<String> countryList
			= new ArrayList<>(List.of(countryArray));

		System.out.println("Converted ArrayList elements: "
						+ countryList);
	}
}
