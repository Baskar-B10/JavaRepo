package com.program.stream;// Java program for list convert in map
// with the help of Collectors.toMap() method 

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors; 

// create a list 
class Studentz {

	// id will act as Key 
	private Integer id; 

	// name will act as value 
	private String name; 

	// create curstuctor for reference 
	public Studentz(Integer id, String name)
	{ 

		// assign the value of id and name 
		this.id = id; 
		this.name = name; 
	} 

	// return private variable id 
	public Integer getId() 
	{ 
		return id; 
	} 

	// return private variable name 
	public String getName() 
	{ 
		return name; 
	} 
} 

// main class and method 
public class ListToMapUsingGroupBy {

	// main Driver 
	public static void main(String[] args) 
	{ 

		// create a list 
		List<Studentz> lt = new ArrayList<>();

		// add the member of list 
		lt.add(new Studentz(1, "Geeks"));
		lt.add(new Studentz(2, "For"));
		lt.add(new Studentz(3, "Geeks"));

		// create map with the help of 
		// Collectors.toMap() method 
		LinkedHashMap<Integer, String> 
			map = lt.stream() 
					.collect( 
						Collectors 
							.toMap(
									Studentz::getId,
									Studentz::getName,
								(x, y) 
									-> x + ", " + y, 
								LinkedHashMap::new)); 

		// print map 
		map.forEach( 
			(x, y) -> System.out.println(x + "=" + y)); 
	} 
} 
