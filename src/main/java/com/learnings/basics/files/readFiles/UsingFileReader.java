package com.learnings.basics.files.readFiles;// Java Program to Illustrate reading from
// FileReader using FileReader class

// Importing input output classes
import java.io.*;

// Main class
// ReadingFromFile
public class UsingFileReader {

    // Main driver method
    public static void main(String[] args) throws Exception
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the Path : ");
        
        // Reading File name
        String path = br.readLine();

        FileReader fr = new FileReader(path);

        // Declaring loop variable
        int i;
      
        // Holds true till there is nothing to read
        while ((i = fr.read()) != -1)

            // Print all the content of a file
            System.out.print((char)i);
    }
}
