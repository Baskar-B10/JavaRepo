package com.learnings.basics.exceptionHandling.avoidNPE;// Ternary operator to avoid NullPointerException

class AvoidNPE3 {
    public static void main(String[] args) {
      
        // Initializing String variable
        // with null value
        String s = null;
        String m
            = (s == null) ? "" : s.substring(0, 5);

        System.out.println(m);

        // Initializing String variable
        // with null value
        s = "Geeksforgeeks";
        m = (s == null) ? "" : s.substring(0, 5);
        System.out.println(m);
    }
}