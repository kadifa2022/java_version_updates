package com.cydeo.functionalInterface;


import com.cydeo.Apple;
import com.cydeo.ApplePredicate;

import java.util.function.*;


public class FunctionalInterface {

    public static void main(String[] args) {


        ApplePredicate ap = new ApplePredicate(){//enumas class is implementing interface

            @Override
            public boolean test(Apple apple) {
                return apple.getWeight()>200;
            }
        };

        System.out.println("-------------PREDICATE INTERFACE RETURNING BOOLEAN -------------");
        // accepting one object<Integer> and returning boolean
        Predicate<Integer> lessThan = i -> i <18;// (i->i<18)implementation of the method inside interface
        System.out.println(lessThan.test(20));//testing the method (test)from interface


        System.out.println("-------------CONSUMER TAKES ONE OBJECT, DONT RETURN ANYTHING  -------------");
        Consumer<Integer> display= i-> System.out.println();
        display.accept(10);

        System.out.println(" ----------BI CONSUMER ACCEPTING 2 OBJECTS RETURNING NOTHING --------");
        BiConsumer<Integer, Integer> addTwo = (x,y)-> System.out.println(x + y);
        addTwo.accept(1,2);

        System.out.println(" ----------FUNCTION  ACCEPTING 1 method  OBJECTS and returning 1 object  --------");
                  //A TYPE   Returning Type
        Function<String, String > fun = s -> "Hello" + s;
        System.out.println(fun.apply("Cydeo"));


        System.out.println(" ---------BI -FUNCTION  ACCEPTING 2 method  OBJECTS and returning 1 object  --------");
         // ACCEPTING T,      T,   Returning Type
        BiFunction<Integer, Integer, Integer>  func = (x1,x2)-> x1+x2;
        System.out.println(func.apply(2,3 ));


        System.out.println(" ----------SUPPLIER DOES NOT TAKE ANY PARAMETER AND RETURN SOMETHING -------");
        Supplier<Double> randomValue= ()->Math.random();// can be anything return type
        randomValue.get();
        System.out.println(randomValue.get());

        System.out.println(" ----------FUNCTION  ACCEPTING  OBJECTS and returning object  --------");

    }
}
