package com.learnings.basics.jdbc;// Java Program illustrating Prepared Statement in JDBC
import java.sql.*;

import java.util.Scanner;

class PreparedDemo {

    public static void main(String[] args) {
      
        // try block to check for exceptions
        try {

            // Loading drivers using forName() method
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Scanner class to take input from user
            Scanner sc = new Scanner(System.in);

            System.out.println(
                "What age do you want to search?? ");

            // Reading age an primitive datatype from user
            // using nextInt() method
            int age = sc.nextInt();

            // Registering drivers using DriverManager
            Connection con = DriverManager.getConnection(
                "jdbc:mysql:///world", "root", "12345");

            // Create a statement
            PreparedStatement ps = con.prepareStatement(
                "select name from world.people where age = ?");

            // Execute the query
            ps.setInt(1, age);
            ResultSet res = ps.executeQuery();

            // Condition check using next() method
            // to check for element
            while (res.next()) {

                // Print and display elements(Names)
                System.out.println("Name : "
                                   + res.getString(1));
            }

        }

        // Catch block to handle database exceptions
        catch (SQLException e) {

            // Display the DB exception if any
            System.out.println(e);
        }

        // Catch block to handle class exceptions
        catch (ClassNotFoundException e) {

            // Print the line number where exception occurred
            // using printStackTrace() method if any
            e.printStackTrace();
        }
    }
}
