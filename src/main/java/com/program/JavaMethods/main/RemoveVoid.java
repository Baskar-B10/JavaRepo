package com.program.JavaMethods.main;

class RemoveVoid {

    /*Error: OverloadingMain method must return a value of type void in class OverloadingMain, please
            define the main method as:
    public static void main(String[] args)*/
    public static int main(String[] args)
    {
        System.out.println("I am a Geek");
        return 1;
    }
}