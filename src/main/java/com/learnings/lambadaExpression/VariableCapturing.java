package com.learnings.lambadaExpression;// Java Program Illustrating Lambda Expression with Instance Variables

// Interface
interface MyInterface { 
    void myFunction(); 
} 

// ConsumerWithAcceptMethodExample class
public class VariableCapturing {
    // Custom initialization
    int data = 170; 

    // ConsumerWithAcceptMethodExample driver method
    public static void main(String[] args) { 
        // Creating object of this class 
        VariableCapturing gfg = new VariableCapturing();

        // Creating object of interface 
        MyInterface intFace = () -> { 
            System.out.println("Data: " + gfg.data); 
            gfg.data += 500; 
            System.out.println("Data after modification: " + gfg.data); 
        }; 

        // Using the lambda expression
        intFace.myFunction(); 

        // Modifying the instance variable
        gfg.data += 200; 
        System.out.println("Final Data: " + gfg.data); 
    } 
}
