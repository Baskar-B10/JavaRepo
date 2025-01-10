package com.learnings.basics.files.readFiles;// Java program to illustrate reading data from file
// using nio.File
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

public class ReadFileIntoList 
{
    public static List<String> readFileInList(String fileName)
    {
          // Created List of String
        List<String> lines = Collections.emptyList();
        
          try {
            lines = Files.readAllLines(
                Paths.get(fileName),
                StandardCharsets.UTF_8);
        } catch(IOException e) {
            // do something
            e.printStackTrace();
        }
      
        return lines;
    }
  
      // Main method
    public static void main(String[] args)
      throws IOException
    {
      
          BufferedReader br = new
          BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the Path : ");
        
        // Reading File name
        String path = br.readLine();
      
        List l = readFileInList(path);
    
          // Iterator iterating over List
        Iterator<String> itr = l.iterator();
      
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
