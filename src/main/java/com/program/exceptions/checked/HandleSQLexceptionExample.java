package com.program.exceptions.checked;// Importing required classes

import java.sql.Connection;
import java.sql.DriverManager;

// Class
public class HandleSQLexceptionExample {

	public static void main(String[] args)
	{
		Connection con=getConnection("javaDb","postgres","abrar");

	}

	public static Connection getConnection(String dbname,String user,String pass)
	{
		Connection con_obj = null;
		String url="jdbc:postgresql://localhost:5432/";

		// Try block t ocheck for exceptions
		try {
			con_obj= DriverManager.getConnection(url+dbname,user,pass);

			if(con_obj!=null)
			{
				System.out.println("Connection established successfully !");
			}
			else
			{
				System.out.println("Connection failed !!");
			}
		}

		// Catch block to hanadle exceptions
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		return con_obj;

	}
}
