package com.learnings.streamAPI.operations.combinationOfOperations.streamToMap;// Java program to convert User[]
// into Map<city, countOfUser> 

import java.util.Arrays; 
import java.util.Map; 
import java.util.stream.*; 

// Implementing the user class 
 class Userz {

	// Parameters of the user class 
	private int userId; 
	private String name; 
	private String city; 

	// Constructor 
	public Userz(int userId, String name,
				String city) 
	{ 
		this.userId = userId; 
		this.name = name; 
		this.city = city; 
	} 

	// Getter functions 
	public int getUserId() { return userId; } 

	public String getName() { return name; } 

	public String getCity() { return city; } 

	// Overriding the toString() method 
	// to create a custom function 
	@Override
	public String toString() 
	{ 
		return "User [userId = "
			+ userId + ", name = "
			+ name + ", city = "
			+ city + "]"; 
	} 
}

 public class StreamToMapUsingGroupByAndCount {

	public static Map toMap(Userz user1,
							Userz user2,
							Userz user3,
							Userz user4,
							Userz user5)
	{ 

		Map<String, Long> 
			cityUserCountMap 
			= Arrays.asList(user1, user2, user3, 
							user4, user5) 
				.stream() 
				.collect( 
					Collectors.groupingBy(
							Userz::getCity,
						Collectors.counting())); 

		return cityUserCountMap; 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 

		// Creating new users 
		Userz user1
			= new Userz(1, "User1", "Pune");
		Userz user2
			= new Userz(2, "User2", "Mumbai");
		Userz user3
			= new Userz(3, "User3", "Nagpur");
		Userz user4
			= new Userz(4, "User4", "Pune");
		Userz user5
			= new Userz(5, "User5", "Mumbai");

		System.out.println(toMap(user1, user2, 
								user3, user4, 
								user5)); 
	} 
} 
