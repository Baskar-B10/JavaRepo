package com.learnings.lambadaExpression;

import java.util.Date;

public class ZeroParameter {
public static void main(String[] args) {
        PrintingValue printingValue = () -> System.out.println("Yes!! its Print Method");
        PrintingValue sayName = () -> System.out.println("My name is B10");
         PrintingValue sayTime = () -> System.out.println(new Date().toInstant());
         printingValue.print();
        sayName.print();
        sayTime.print();
    }
}
interface  PrintingValue{
 void print ();
}
