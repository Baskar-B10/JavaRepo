package com.learnings.optional;

import java.util.Optional;

public class EqualsDemo {
    public static void main(String[] args)
    {

        Optional<Integer> op1
                = Optional.of(456);

        System.out.println("Optional 1: "
                + op1);

        Optional<Integer> op2
                = Optional.of(456);

        System.out.println("Optional 2: "
                + op2);

        System.out.println("Comparing Optional 1"
                + " and Optional 2: "
                + op1.equals(op2));

        Optional<Integer> op3
                = Optional.of(456);

        System.out.println("Optional 3: "
                + op3);

        Optional<Integer> op4
                = Optional.empty();

        System.out.println("Optional 4: "
                + op4);

        System.out.println("Comparing Optional 3"
                + " and Optional 4: "
                + op3.equals(op4));
    }
}
