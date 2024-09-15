package com.testSkills;

public class Testing {

    // Online Java Compiler
// Use this editor to write, compile and run your Java code online

        public static void main(String[] args) {
            System.out.println("Try programiz.pro");
            int num= 45654;

            //System.out.println( isPalindrom(num));
            if(isPalindrom(num)){
                String stringNum=  String.valueOf(num);
                int length=stringNum.length();
                int mid= stringNum.length()/2;
                //System.out.println(mid);
                int newNum=0;
                int dif=length-mid;
                int count=0;
                while(num!=0){
                    int tmp= num%10;
                    if(dif >count){
                     newNum = newNum*10 + tmp;

                    }else{
                         newNum = newNum*10 + tmp+1;
                     }
                    num= num/10;
                    count++;

                }
                System.out.println(newNum);
            }

        }
        //43535
        public static boolean isPalindrom(int number){
            int palindromNum=0;
            int tempNum=number;
            while (number!=0){

                int tmp= number%10;
                palindromNum= palindromNum*10 + tmp;
                number= number/10;
            }
            //System.out.println(palindromNum);
            // System.out.println(number);
            if(palindromNum == tempNum){
                return true;
            }
            return false;
        }

}
