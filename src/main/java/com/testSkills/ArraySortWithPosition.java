package com.testSkills;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortWithPosition {

    public static void main(String[] args) {

        int[] array={34,6,12,4,23,35,1,8};
        Integer[] array1=new Integer[array.length];

        for (int i=0;i<array.length;i++){
            array1[i]=array[i];
        }
        int random=4;
int size=array.length;
        Arrays.sort(array1,0,random);
        Arrays.sort(array1,random,size,Collections.reverseOrder());

        for (int i=0;i<array1.length;i++){
            System.out.println(array1[i]);
        }

    }
}
