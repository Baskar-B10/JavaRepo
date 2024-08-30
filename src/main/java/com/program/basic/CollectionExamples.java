package com.program.basic;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionExamples {
    public static void main(String[] args) {

    }

    static int biggestOfThreeUsingCollections(int a, int b, int c){
        ArrayList<Integer> x = new ArrayList<>();
        x.add(a);
        x.add(b);
        x.add(c);
         // Printing the largest number
        return Collections.max(x);
    }
}
