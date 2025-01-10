package com.learnings.basics.inputOutput.BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
    public static void main(String[] args)
        throws IOException
    {
        BufferedReader r = new BufferedReader(
            new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = r.readLine();

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(r.readLine());

        System.out.println("Name: " + name
                           + ", Age: " + age);
    }
}
