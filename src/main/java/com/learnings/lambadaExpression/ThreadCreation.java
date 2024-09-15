package com.learnings.lambadaExpression;

public class ThreadCreation {
 public static void main(String[] args) {
        // Creating Lambda expression for run() method in
        // functional interface "Runnable"
        Runnable runnable = () -> {
            Thread.currentThread().setName("Thread1");
            System.out.println("Thread running is:"+  Thread.currentThread().getName());
        };
        // Instantiating Thread class by passing Runnable
        // reference to Thread constructor
        Thread thread1 =new Thread(runnable);
        thread1.start();
    }
}
