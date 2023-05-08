package com.cydeo.streamPratice;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.List;

public class StreamIntermediateOperations {
    public static void main(String[] args) {


        List<Integer> list= Arrays.asList(1,2,3,4,5);
        list.forEach(System.out::println);// forEach() coming from iterable interface and  we can use as terminate operate

   // filter = for loop and if statement and accepting predicate  Interface  accepting one parameter and returning boolean


        System.out.println("---------------------Filter -----------------------------");

        list.stream()
                .filter(i->i%2==0)
                .forEach(System.out::println);// close stream with forEach()

        System.out.println("---------------------Distinct() -----------------------------");

        list.stream()// unique products
                .filter(i ->i%2 ==0 )
                .distinct()
                .forEach(System.out::println);// close stream

        System.out.println("---------------------Limit() -----------------------------");
        //show  top product

        list.stream()
                .filter(i->i %2 ==0)
                .limit(1)
                .forEach(System.out::println);

        System.out.println("---------------------Skip() -----------------------------");
        // skip  first element

        list.stream()
                .filter(i->i%2 ==0)
                .skip(1)
                .forEach(System.out::println);

        System.out.println("---------------------Map() ------------------------------");

        list.stream()
                .map(number->number *2)
                .filter(i->i%3==0)
                .forEach(System.out::println);







    }

}
