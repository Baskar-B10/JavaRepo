package com.testSkills;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GetFirstDistinctCharacterFromString {
  public static void main(String[] args) {
	  System.out.print("main method");
	  
	  String s ="google";
	  //String [] strArray= s.split("");
		/*
		 * Map<String,Long> uniqueStr=Stream.of(strArray).
		 * collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		 * 
		 * System.out.print(uniqueStr);
		 * 
		 * System.out.print( uniqueStr.entrySet().stream(). filter(t -> t.getValue()
		 * ==1).findFirst() );
		 */
	
	Optional<Character> firstChar= s.chars().mapToObj(c -> (char) c).
			collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
					Collectors.counting())).
			entrySet().stream().filter(Entry -> Entry.getValue() ==1).map(Map.Entry::getKey).findFirst();


	System.out.print(firstChar);


	  
  }

}
