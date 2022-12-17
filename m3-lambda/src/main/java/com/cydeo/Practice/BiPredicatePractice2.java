package com.cydeo.Practice;

import java.util.function.BiPredicate;

public class BiPredicatePractice2 {

    public static void main(String[] args) {

        BiPredicate<int[], Integer> contains = (arr, num) -> {
            boolean result = false;
            for (int each : arr) {
                if (each == num) {
                    result = true;
                }
            }
            return result;

        };
        int[] arr={10,20,30,40};
        boolean r= contains.test(arr,30);
        System.out.println(r);

    }


}
