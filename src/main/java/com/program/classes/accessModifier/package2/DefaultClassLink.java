// Java program to illustrate error while 
// using class from different package with 
// default modifier 
package com.program.classes.accessModifier.package2;



import com.program.classes.accessModifier.package1.*;
//Compile time error
// This class is having default access modifier
class DefaultClassLink
{ 
    public static void main(String args[]) 
    { 
        // Accessing class Geek from package p1 


        //DefaultClass defaultClass= new DefaultClass();

       // defaultClass.display();
    } 
} 