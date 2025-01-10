package com.learnings.basics.inputOutput;// java program to use FileOutputStream object for writing
// data

import java.io.*;

class FileOutputStreamDemo {
	public static void main(String[] args)
		throws IOException
	{
		int i;
	
		// create a fileoutputstream object
		FileOutputStream fout = new FileOutputStream("../files/name3.txt",
									true);
	
		// we need to transfer this string to files
		String st = "TATA";

		char ch[] = st.toCharArray();
		for (i = 0; i < st.length(); i++) {
		
			// we will write the string by writing each
			// character one by one to file
			fout.write(ch[i]);
		}
	
		// by doing fout.close() all the changes which have
		// been made till now in RAM had been now saved to
		// hard disk
		fout.close();
	}
}
