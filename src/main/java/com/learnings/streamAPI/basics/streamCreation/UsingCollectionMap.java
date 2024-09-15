package com.learnings.streamAPI.basics.streamCreation;// Java Program to convert
// Map<Key, Value> into StreamDemo

import java.util.*; 
import java.util.stream.*; 

class UsingCollectionMap {

	// Generic function to convert List of 
	// String to List of Integer 
	public static <K, V> Stream<Map.Entry<K, V> > 
	convertMapToStream(Map<K, V> map) 
	{ 

		// Return the obtained StreamDemo
		return map 

			// Convert the Map to Set 
			.entrySet() 

			// Convert the Set to StreamDemo
			.stream(); 
	}

	public static <K, V> Stream<K>
	convertMapKeyToStream(Map<K, V> map)
	{

		// Return the obtained StreamDemo
		return map

		//Convert the Map to Set<Key>
				.keySet()
				// Convert the Set to StreamDemo
				.stream();
	}

	public static <K, V> Stream<V>
	convertMapValueToStream(Map<K, V> map)
	{

		// Return the obtained StreamDemo
		return map

				//Convert the Map to Set<Key>
				.values()
				// Convert the Set to StreamDemo
				.stream();
	}


	public static void main(String args[]) 
	{ 

		// Create a Map 
		Map<Integer, String> map = new HashMap<>(); 

		// Add entries to the Map 
		map.put(1, "Geeks"); 
		map.put(2, "forGeeks"); 
		map.put(3, "A computer Portal"); 

		// Print the Map 
		System.out.println("Map: " + map); 

		// Convert the Map to StreamDemo
		Stream<Map.Entry<Integer, String> > stream = 
								convertMapToStream(map); 

		// Print the TreeMap 
		System.out.println("StreamDemo: "
					+ Arrays.toString(stream.toArray()));

		Stream<Integer> streamKey =
				convertMapKeyToStream(map);

		// Print the TreeMap
		System.out.println("StreamDemo keys: "
				+ Arrays.toString(streamKey.toArray()));

		Stream<String> streamValue =
				convertMapValueToStream(map);

		// Print the TreeMap
		System.out.println("StreamDemo values: "
				+ Arrays.toString(streamValue.toArray()));
	} 
} 
