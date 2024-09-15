package com.learnings.lambadaExpression;
import java.util.ArrayList;
public class SingleParameter {
    public static void main(String[] args) {
    ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.forEach(integer -> System.out.println("Integers "+ integer +
                " compared to 2 is "+ integer.compareTo(2)));

        arrL.forEach(n -> {
            if (n % 2 == 0){
                System.out.println(n+ " is even num");
            }else{
                System.out.println(n+ " is odd num but multiple by 2 to get even " + n*2);
            }
         });
    }
}


