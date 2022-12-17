package com.cydeo.Practice;

import java.util.function.Predicate;

public class PredicateInterface {

    public static void main(String[] args) {

        Predicate<Integer> isEven= a-> a % 2 ==0;
        boolean r1 = isEven.test(200);
        System.out.println(r1);

    }
}
