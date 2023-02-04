package com.cydeo;

import java.util.function.*;

public class FunctionalInterface {// functional Interface ready interfaces -created -parameter and return type

                                   // if we don't find one // create your  own

    public static void main(String[] args) {

        ApplePredicate ap = new ApplePredicate() {
         public boolean test(Apple apple){
             return  apple.getWeight()>200;
         }

        };


        ApplePredicate ap1 = new ApplePredicate() {

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

        Consumer<Integer> display= i-> System.out.println(i);
        display.accept(10);

        System.out.println("******************BI CONSUMER**********************");
        //BI CONSUMER ACCEPTING 2 OBJECTS AND RETURN NOTHING

        BiConsumer<Integer, Integer> addTwo= (x,y) -> System.out.println(x+y);
        addTwo.accept(1,2);

        System.out.println("******************FUNCTION**********************");
        //ACCEPTING OBJECT AND RETURNS OBJECT <>Generic
        Function<String, String> fun= s-> "Hello" + s;
        System.out.println(fun.apply("Cydeo")); //if returning something we need sout

        System.out.println("******************BI FUNCTION**********************");
        //accept two parameters and returns result
        BiFunction<Integer, Integer, Integer> func= (x1, x2)->x1+x2;
        System.out.println(func.apply(2,3));

        System.out.println("******************SUPPLIER*********************");

        //does not have any parameter and returns anything

        Supplier<Double> randomValue= ()->Math.random();
        System.out.println(randomValue.get());









    }

    public static interface ApplePredicate {
    }
}
