package com.learnings.basics.arrays.finalArray;

class FinalArrayModifyElements {
public static void main(String args[])
    {
// Declaring a final array
        final int arr[] = { 1, 2, 3, 4, 5 };
// Iterating over integer array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 10;
            System.out.println(arr[i]);}}}
