package com.program.collections.arrayToCollection;

import java.util.*;

class ArrayToListUsingAddAll {
	public static void main(String[] args)
	{
		String countryArray[]
			= { "India", "Pakistan", "Afganistan",
				"Srilanka" };

		List<String> countryList = new ArrayList<>();
		Collections.addAll(countryList, countryArray);

		System.out.println("Converted ArrayList elements: "
						+ countryList);
	}
}
