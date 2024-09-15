package com.learnings.streamAPI.basics.file;// Java Program to demonstrate
// File Write Operation
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

// Driver Class
class FileWriteOperation {
    // main function
    public static void main(String[] args)
    {
        String[] words
            = { "Geeks", "for", "Geeks", "Hello", "World" };

        // Replace with the
        // actual file path

        String fileName = "path/to/your/file.txt";

        // Step 1: Create a PrintWriter to write to the
        // file
        try (PrintWriter pw
             = new PrintWriter(Files.newBufferedWriter(
                 Paths.get(fileName)))) {

            // Step 2: Use StreamDemo to write each word to the
            // file
            Stream.of(words).forEach(pw::println);

            // Step 3: Print success message to the console
            System.out.println(
                "Words written to the file successfully.");
        }
        catch (IOException e) {
            // Step 4: Handle any IO exception that occurs
            // during the file writing process
            e.printStackTrace();
        }
    }
}
