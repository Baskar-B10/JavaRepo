package com.program.classes.keywords;// PublicMethods java program to demonstrate use
// of static keyword with Classes

public class StaticNestedClass {

    private static String str = "GeeksforGeeks";

    // Static class
    static class MyNestedClass {
      
        // non-static method
        public void disp(){ 
          System.out.println(str); 
        }
    }
  
    public static void main(String args[])
    {
        StaticNestedClass.MyNestedClass obj
            = new StaticNestedClass.MyNestedClass();
        obj.disp();
    }
}
