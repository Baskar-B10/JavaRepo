package com.program.exceptions.runTime;//program to print the exception information using printStackTrace() method

class ArithmeticExceptionExample {
    public static void main (String[] args) {
      int a=5;
      int b=0;
        try{
          System.out.println(a/b);
        }
      catch(java.lang.ArithmeticException e){
        e.printStackTrace();
        System.out.println("toSting: "+ e.toString());

          System.out.println("get message: "+e.getMessage());
      }
    }
}
