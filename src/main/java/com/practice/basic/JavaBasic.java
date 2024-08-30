package com.practice.basic;

public class JavaBasic {
    public static void main(String[] args) {
        System.out.print("Hello World");// print on same line
       System.out.println(compareNM(7,10));
        printInFormat(5.43f, 2.653f);
        System.out.println(toLower("Baskar"));

        System.out.println("India");
        System.out.println("is");
        System.out.println("my Country");
    }
    static void printInFormat(float a, float b){
        float result = a/b;

        System.out.printf("%5.7f", result );// print upto 7 decimal

        System.out.printf(" %5.3f", result);// print upto 3 decimal
        // Your code here to print upto 3 decimal places

    }

    public static String compareNM(int n, int m) {
        // code here
        String output="";
        if(n==m){
            output= "equal";
        }else if (n>m){
            output= "greater";
        }
        else if (n<m){
            output= "lesser";
        }
        return output;
    }

    static String toLower(String s) {
        // code here
        return s.toLowerCase();
    }
}
