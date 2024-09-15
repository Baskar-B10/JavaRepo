package com.testSkills;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberOccurance {

    public static void main(String[] args) {
        BigDecimal  num= new BigDecimal(1242342354);
        String valString = String.valueOf(num);
        Map<String,Long> map=Arrays.stream(valString.split(""))
                .collect(Collectors.groupingBy(s -> {
                    return s;
                }, Collectors.counting()));

        map.forEach((s, aLong) -> System.out.println(s +" occurs at "+ aLong +" times"));

    }
}
