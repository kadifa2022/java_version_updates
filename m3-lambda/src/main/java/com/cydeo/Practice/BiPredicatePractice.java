package com.cydeo.Practice;

import java.util.function.BiPredicate;

public class BiPredicatePractice {// takes two arguments and return boolean(true, false)

    public static void main(String[] args) {

        BiPredicate<int[], Integer> contains= ( arr, num)->{
            boolean result = false;
            for (int each : arr) {
                if(each== num){
                    result= true;
                    break;
                }
                
            }
            return result;
        };

        int []arr = {10,20,30,40};
                 Boolean r1 =contains.test(arr,50);

        System.out.println(r1);
    }
}
