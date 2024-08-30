package com.practice.mathematical;

import java.util.ArrayList;
import java.util.List;

public class MathOperations {


    public static void main(String[] args) {

        System.out.println(floorSqrt(10))  ;
        List<Double> list = new ArrayList<Double>();
        list.add(5d);
        System.out.println(switchCase(1,list))  ;
        list.add(10d);
        System.out.println(switchCase(2,list))  ;
    }

        static long floorSqrt(long n) {
            // Your code here

            int out = (int) Math.sqrt(n);
            return Long.valueOf(out);
        }

    static double switchCase(int choice, List<Double> arr){
        double output=0;
        switch (choice){

            case 1:
                 output=Math.PI * Math.pow(arr.get(0),2);
                 break;
            case 2:
                 output=arr.get(0) * arr.get(1);
                break;
        }
        // code here
        return output;
    }

}
