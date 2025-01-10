package com.learnings.basics.arrays.finalArray;

class FinalInstantiationDemo {
int p = 20;
    public static void main(String args[])
    {final FinalInstantiationDemo t = new FinalInstantiationDemo();
        t.p = 30;
        //t= new FinalInstantiationDemo();
        System.out.println(t.p);}}
