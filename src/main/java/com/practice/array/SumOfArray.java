package com.practice.array;

// User function Template for Java

import java.util.Arrays;

class SumOfArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
       System.out.println(sum(arr));
    }
    static int sum(int arr[]) {
        // code here
        int output=0;
        for (int num : arr){
            output=output+num;
        }
        return output;
    }
}