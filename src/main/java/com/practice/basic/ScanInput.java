package com.practice.basic;

import java.util.Scanner;

public class ScanInput {

    public static void main(String[] args) {
        //IOFunction();
        print();
    }

    static void IOFunction() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int a = sc.nextInt();
            float b = sc.nextFloat();
            long c = sc.nextLong();
            byte d = sc.nextByte();
            sc.nextLine();
            String s = sc.nextLine();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(s);

            // Your code here

        }



    }

    static void print(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = s.next();
        System.out.println("Enter Your Age: ");
        int age = s.nextInt();
        System.out.println("Enter Your E-mail: ");
        String email = s.next();
        System.out.println("Enter Your Address: ");
        String address = s.next();

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("E-mail: "+email);
        System.out.println("Address: "+address);
    }
}
