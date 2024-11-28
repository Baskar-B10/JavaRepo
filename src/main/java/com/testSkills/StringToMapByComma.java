package com.testSkills;
import java.util.Map;
import java.util.HashMap;

public class StringToMapByComma {
  public static void main(String[] args) {
	  
	  String input="acd,abc, aab, acd, abc, acb,abb,abc, add,adb";
	  
	  String [] strArray = input.split(",");
	  
	  Map<String,Integer> mapList = new HashMap<String,Integer>();
	  
	  int count =1;
	  for(String str: strArray) {
		  
		  if(null!=str && !str.trim().isBlank()) {
			  String key =str.trim();
			  
			  
			  if(!mapList.containsKey(key)) {
				  mapList.put(key, count);
			  }else {
				 int counts= mapList.get(key);
				 mapList.put(key, counts+1);
			  }
		  }
		  
	  }
	  
	  for(Map.Entry<String,Integer> entry: mapList.entrySet()) {
		  System.out.println(entry.getKey() + " " + entry.getValue());
	  }
	  
  }

}
