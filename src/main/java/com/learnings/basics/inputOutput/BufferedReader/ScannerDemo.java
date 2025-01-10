package com.learnings.basics.inputOutput.BufferedReader;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your name: ");
      
        String name = s.nextLine();
        System.out.print("Enter your age: ");
      
        int age = s.nextInt();
        System.out.println("Name: " + name
                           + ", Age: " + age);
        s.close();
    }
}
