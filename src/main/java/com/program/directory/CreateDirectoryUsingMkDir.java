package com.program.directory;// Java Program to Create Directories Recursively

// Importing required classes
import java.io.File;

// FileSearch class
class CreateDirectoryUsingMkDir {

	// Method
	// To create directories
	static void file(String md, String path, int depth)
	{

		// md stores the starting path each character in
		// path represents new directory depth stores
		// the number of directories to be created
		// terminating condition

		if (depth == 0)
			return;

		// Decrementing the depth by 1
		depth -= 1;

		// Checking if the path exists
		if (path.length() == 0)
			System.out.println("Path does not exist");

		// execute if the path has more directories
		else {

			// appending the next directory
			// would be md = md + "\\" +
			// path.charAt(0) for windows
			md = md + "/" + path.charAt(0);

			// removing the first character
			// from path string
			path = path.substring(1);

			// creating File object
			File f = new File(md);

			// if the directory already exists
			if (f.exists()) {
				System.out.println("The Directory "
								+ "already exists");
			}
			else {

				// creating the directory
				boolean val = f.mkdir();
				if (val)
					System.out.println(md + " created"
									+ " successfully");
				else
					System.out.println(
						"Unable to "
						+ "create Directory");
			}
		}

		// recursive call
		file(md, path, depth);
	}

	// Driver method
	public static void main(String[] args)
	{

		// creating class object
		CreateDirectoryUsingMkDir ob = new CreateDirectoryUsingMkDir();

		// path for windows -> "C:\\Users\\
		// harshit\\Desktop"
		ob.file("C:\\Users\\Admin\\Desktop\\test", "abcd", 4);
	}
}
