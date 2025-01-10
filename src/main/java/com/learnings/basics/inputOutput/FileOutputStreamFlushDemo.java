package com.learnings.basics.inputOutput;// java program to show the usage of flush() method
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamFlushDemo {
	public static void main(String[] args)
		throws IOException
	{

		FileOutputStream out = null;
		String data = "Welcome to GfG";

		try {
			out = new FileOutputStream(" flush.txt");

			// Using write() method
			out.write(data.getBytes());

			// Using the flush() method
			out.flush();
			out.close();
		}
		catch (Exception e) {
			e.getStackTrace();
		}
	}
}
