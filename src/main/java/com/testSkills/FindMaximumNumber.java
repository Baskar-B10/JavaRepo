package com.testSkills;

import java.util.Arrays;
import java.util.List;

public class FindMaximumNumber {
    public static void main(String[] args) {
        List<Integer> intlist= Arrays.asList(234,56,245,3456,477,24,2567,9877);

       int maxNum= intlist.stream().max(Integer::compareTo)
               .get();

       System.out.println(maxNum);
    }

}
