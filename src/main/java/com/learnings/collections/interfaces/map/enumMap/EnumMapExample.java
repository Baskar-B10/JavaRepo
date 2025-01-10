package com.learnings.collections.interfaces.map.enumMap;

import java.util.EnumMap;

enum Days { 
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY 
} 

public class EnumMapExample { 
	public static void main(String[] args) { 
		EnumMap<Days, String> schedule = new EnumMap<>(Days.class); 
		
		// Adding elements to the EnumMap 
		schedule.put(Days.MONDAY, "Work"); 
		schedule.put(Days.TUESDAY, "Work"); 
		schedule.put(Days.WEDNESDAY, "Study"); 
		schedule.put(Days.THURSDAY, "Study"); 
		schedule.put(Days.FRIDAY, "Relax"); 
		
		// Getting elements from the EnumMap 
		System.out.println(schedule.get(Days.MONDAY)); // Output: Work 
		System.out.println(schedule.get(Days.FRIDAY)); // Output: Relax 
	} 
} 
