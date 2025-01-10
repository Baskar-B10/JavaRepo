package com.learnings.basics.inputOutput.BufferedReader;//Java program to read input using DataInputStream class
import java.io.*;

public class UsingDataStream {
    public static void main(String[] args) throws IOException {
        DataInputStream reader = new DataInputStream(System.in);
        
        // Reading integers
        System.out.print("Enter an integer: ");
        int inputInt = Integer.parseInt(reader.readLine());
        
        // Reading strings
        System.out.print("Enter a string: ");
        String inputString = reader.readLine();
        System.out.println("You entered integer: " + inputInt);
        System.out.println("You entered string: " + inputString);
        
    }
}
