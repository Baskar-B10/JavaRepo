package com.learnings.basics.exceptionHandling.avoidNPE;// Invoking a method on null
// causes NullPointerException

class AvoidNPE1 {
    public static void main (String[] args) {
      
        // Initializing String variable 
        // with null value
        String s = null;

        // Checking if s.equals null
        try
        {
            // This line of code throws NullPointerException
            // because s is null
            if ("gfg".equals(s))
                System.out.print("Same");
            else 
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException Caught");
        }
    }
}