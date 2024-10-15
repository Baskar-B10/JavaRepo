package com.program.JavaMethods.main;

class RemovePublic {

   /* Error: OverloadingMain method not found in class, please define the main method as:
    public static void main(String[] args)
    or a JavaFX application class must extend javafx.application.Application*/
    private static void main(String[] args)
    {
        System.out.println("I am a TemporalAdjusterDemo");
    }
}

