package com.program.JavaMethods.main;// Java Program to demonstrate the
// error occurred when we name the
// main() method as newmain.

class RemoveMain {

   /* Error: OverloadingMain method not found in class, please define the main method as:
    public static void main(String[] args)
    or a JavaFX application class must extend javafx.application.Application*/
    public static void newmain(String[] args)
    {
        System.out.println("I am a Geek");
    }
}