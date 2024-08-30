package com.practice.mathematical;

/*Complete the Function below*/
class Palindrome {

    public static void main(String[] args) {

        int[] arr= {12,212,45,34};
       System.out.println(palinArray(arr));
    }
    public static boolean palinArray(int[] arr) {
        // add code here.
        for(int num: arr){
            int original = num;
            int reverse=0;
            
            while(original!=0){
                int digit= original % 10;
                reverse= reverse * 10 + digit;
                original = original/10;
            }
            if(reverse != num){
                return false;
            }
           
        }
         return true;
    }
}