package com.learnings.streamAPI.operations.combinationOfOperations.streamToMap;// Java program to convert the User[]
// into Map<city, List<User>> 

import java.util.Arrays; 
import java.util.Map; 
import java.util.List; 
import java.util.stream.*; 

// Implementing the User class 
 class User {

	// Parameters of the user class 
	private int userId; 
	private String name; 
	private String city; 

	// Constructor of the User class 
	public User(int userId, String name, 
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

public class StreamToMapUsingGroupBy {

	// Function to convert the user 
	// object to the map 
	public static Map toMap(User user1, 
							User user2, 
							User user3, 
							User user4, 
							User user5) 
	{ 
		Map<String, List<User> > 
			cityUserListMap 
			= Arrays.asList(user1, user2, user3, 
							user4, user5) 
				.stream() 
				.collect(Collectors.groupingBy( 
					User::getCity)); 

		return cityUserListMap; 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 

		// Creating new users 
		User user1 
			= new User(1, "User1", "Pune"); 
		User user2 
			= new User(2, "User2", "Mumbai"); 
		User user3 
			= new User(3, "User3", "Nagpur"); 
		User user4 
			= new User(4, "User4", "Pune"); 
		User user5 
			= new User(5, "User5", "Mumbai"); 

		System.out.println(toMap(user1, user2, 
								user3, user4, 
								user5)); 
	} 
} 
