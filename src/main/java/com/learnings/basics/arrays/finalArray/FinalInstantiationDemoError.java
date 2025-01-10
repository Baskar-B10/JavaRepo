package com.learnings.basics.arrays.finalArray;

class FinalInstantiationDemoError {
int p = 20;
// Main driver method
    public static void main(String args[])
    {// Creating objects of above class
        final FinalInstantiationDemoError t1 = new FinalInstantiationDemoError();
        FinalInstantiationDemoError t2 = new FinalInstantiationDemoError();// Assigning values into other objects
        //t1 = t2;
System.out.println(t1.p);}}
