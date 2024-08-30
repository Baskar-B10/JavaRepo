package com.program.classes.keywords;

public class StaticExample {
    public static int count = 0;
    public int id;

    public StaticExample() {
        count++;
        id = count;
    }

    public static void printCount() {
        System.out.println("Number of instances: " + count);
    }

    public void printId() {
        System.out.println("Instance ID: " + id);
    }

    public static void main(String[] args) {
        StaticExample e1 = new StaticExample();
        StaticExample e2 = new StaticExample();
        StaticExample e3 = new StaticExample();

        e1.printId();
        e2.printId();
        e3.printId();

        StaticExample.printCount();
    }
}
