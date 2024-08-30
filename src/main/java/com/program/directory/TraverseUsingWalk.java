package com.program.directory;// Java Program to Display Files with
// Complete Path Present in a Directory

// Importing required classes
import java.io.*;
import java.nio.file.*;
import java.util.stream.Stream;

// FileSearch class
class TraverseUsingWalk {

	// FileSearch driver method
	public static void main(String[] args)
		throws IOException
	{

		// Creating try-catch block and
		// providing the directory path of local machine
		try (Stream<Path> filepath
			= Files.walk(Paths.get("C:\\Users\\Admin\\Desktop\\demo\\src\\main\\java\\com")))

		{
			// Printing the name of directories and files
			// with entire path
			filepath.forEach(System.out::println);
		}

		// Catch block to handle exceptions
		catch (IOException e) {

			// If no such directory exists throw an
			// exception
			throw new IOException("Directory Not Present!");
		}
	}
}
