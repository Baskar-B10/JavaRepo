package com.program.JavaMethods.main;

class CommandLineArgument {

    // Commamd-Line Code ->
    // javac CommandLineArgument.java
    // java CommandLineArgument 1 2 3

    public static void main(String[] args)
    {
        for (String elem : args)
            System.out.println(elem);
    }
}