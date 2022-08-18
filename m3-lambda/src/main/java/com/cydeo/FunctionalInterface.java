package com.cydeo;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterface {// functional Interface ready interfaces -created -parameter and return type

                                   // if we don't find // create own

    public static void main(String[] args) {

        ApplePredicate ap = new ApplePredicate() {

            public boolean test(Apple apple){
                return apple.getWeight()>200;
            }
        };
      System.out.println("*******************PREDICATE**************************");

        //  Predicate functional interface excepting object and return boolean

        Predicate<Integer> lesserThan= i -> i <18;
        System.out.println(lesserThan.test(20));

        System.out.println("*******************CONSUMER**************************");

        // CONSUMER ACCEPTS OBJECT, DOES NOT RETURN ANYTHING

        Consumer<Integer> display= i-> System.out.println();
        display.accept(10);








    }

    public static interface ApplePredicate {
    }
}
