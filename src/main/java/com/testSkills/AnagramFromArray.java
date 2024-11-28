package com.testSkills;
import java.util.*;
import java.util.stream.IntStream;

public class AnagramFromArray {
  public static void main(String[] args) {
	String[] str=  {"eat","tea","tan","ate","nat","bat"};
	Map<String,List<String>> maps= new HashMap<String,List<String>>();

	
	Map<String,List<String>> outputMap= new
			HashMap<String,List<String>>();
	
	for(String s: str) { 
	char[] chars=s.toCharArray();

		Arrays.sort(chars);

		String sortedString=new String(chars);

		List<String> vals = new ArrayList<String>();
		if(!outputMap.containsKey(sortedString)) {
			vals.add(sortedString);
		outputMap.put(sortedString, vals);
	}else {
		vals =outputMap.get(sortedString);
		vals.add(s);
		outputMap.put(sortedString, vals);
	}
	
	}
	
	for(Map.Entry<String,List<String>> entry: outputMap.entrySet()) {
		
		System.out.println(entry.getKey() + " " + entry.getValue());
		
	}
  }

}
