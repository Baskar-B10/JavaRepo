package com.learnings.basics.inputOutput.BufferedReader;// Writing data to a file
// using BufferedOutputStream
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo {
    public static void main(String[] args)
    {
        String s
            = "This is an example of BufferedOutputStream.";

        try (FileOutputStream fileOutputStream
             = new FileOutputStream("output.txt");
             BufferedOutputStream bufferedOutputStream
             = new BufferedOutputStream(fileOutputStream)) {

            // Convert string to bytes and write to the
            // buffered output stream
            bufferedOutputStream.write(s.getBytes());

            System.out.println(
                "Data written to the file successfully.");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}