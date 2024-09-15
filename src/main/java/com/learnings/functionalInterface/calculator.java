package com.learnings.functionalInterface;
public class calculator{
 public static void main(String[] args) {
        MathematicalInterface addition= (a, b) ->
                System.out.println("Addition:" +(a+b));
        addition.calculate(3,6);
        MathematicalInterface subtraction= (a, b) ->
                System.out.println("subtraction:" +(a-b));
        subtraction.calculate(36,6);
        MathematicalInterface multiply= (a, b) ->
                System.out.println("multiply:" +(a*b));
        multiply.calculate(4,6);
        MathematicalInterface division= (a, b) ->
                System.out.println("division:" +(a/b));
        division.calculate(54,6);
        MathematicalInterface.staticMethod();
         MathematicalInterface mathematicalInterface = new MathematicalInterface() {
             @Override
             public void calculate(int a, int b) {
                 System.out.println("calculation Method for "+a +" and "+ b);
             }

         };
        mathematicalInterface.calculate(12,6);
        mathematicalInterface.defaultMethod();
         MathematicalInterface modulus= (a, b) ->
                System.out.println("modulus:" +(a%b));
        modulus.calculate(12,6);
    }
}
@FunctionalInterface
 interface MathematicalInterface {
    void calculate(int a, int b);
    default void defaultMethod(){
        System.out.println("default method");
    }
     static void staticMethod(){
        System.out.println("static method");
    }
}
