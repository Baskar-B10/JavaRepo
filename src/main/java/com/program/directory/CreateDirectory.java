package com.program.directory;// Java code to create directories recursively

// importing the packages
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;

class CreateDirectory {

	// defining the recursive method
	static void file(String md, String path, int depth)
	{

		// base case
		if (depth == 0)
			return;

		// decrement the depth
		depth -= 1;

		// check if the path is empty
		if (path.length() == 0)
			System.out.println("Path does not exist");
		else {

			// appending the first character from
			// path string
			md = md + "/" + path.charAt(0);

			// removing the first character from
			// path string
			path = path.substring(1);

			// creating the path instance from
			// path string
			Path p = Paths.get(md);

			// if the directory already exists
			if (!Files.exists(p)) {
				try {

					// creating directory
					Files.createDirectories(p);
					System.out.println(md + " created"
									+ " successfully");
				}
				catch (IOException err) {
					err.printStackTrace();
				}
			}
			else
				System.out.println("The directory "
								+ "already exists");
		}

		// recursive call
		file(md, path, depth);
	}

	// Driver Code
	public static void main(String[] args)
	{

		// creating the object of the class
		CreateDirectory ob = new CreateDirectory();

		// md would be -> "C:\\Users\\harshit\\
		// Desktop for windows
		ob.file("C:\\Users\\Admin\\Desktop\\test", "klm", 5);
	}
}
