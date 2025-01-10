// Java Program to illustrate
// reading from text file
// as string in Java
package com.learnings.basics.files.readFiles;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.*;

public class ReadTextAsString {

    public static String readFileAsString(String fileName)
        throws Exception
    {
        String data = "";
        data = new String(
            Files.readAllBytes(Paths.get(fileName)));
        return data;
    }

    public static void main(String[] args) throws Exception
    {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the Path : ");
        
        // Reading File name
        String path = br.readLine();
      
        String data = readFileAsString(path);
      
        System.out.println(data);
    }
}
