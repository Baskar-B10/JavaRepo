package com.practice.mathematical;


class SumOfSeries {
    public static void main(String[] args) {
        System.out.println(seriesSum(7));
    }
    public static long seriesSum(int n) {
        long limit= n;
        long output=0;

       
       output= limit * (limit +1)/2;
      return output;
    }
}