package com.testSkills;

public class Calculator {

    public static void main(String[] args) {

        String data ="2 @ 4";
        String[] val =data.split(" ");
        double a = Double.parseDouble(val[0]);
        double b = Double.parseDouble(val[2]);
        String operation =val[1];
        double results=0;
        try{
            results=calculations(a,b,operation);
            System.out.println(results);
        }
        catch (NumberFormatException ne){
            System.out.println(ne.getMessage());
        }
        catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
        catch (IllegalArgumentException ie){
            System.out.println(ie.getMessage());
        }

    }

    public  static double  calculations(double a, double b, String operation )
    throws ArithmeticException,IllegalArgumentException{
        double result=0;
        switch(operation){
            case "/":
                if(b==0){
                    throw new ArithmeticException("not divide by 0");
                }else{
                    result=a/b;
                }
                break;
            case "*":
                result=a*b;
                break;

            case "+":
                result= a+b;
                break;
            case "-":
                result= a-b;
                break;
            case "%":
                result= a%b;
                break;
            default:
                throw new IllegalArgumentException("Invalid");

        }
        return result;
    }
}
