package com.cydeo.java11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateNotDemo {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);

        Predicate<Integer> even= i->i%2==0;// created Predicate
       // Predicate<Integer> odd = i-> i%2 !=0;
       Predicate<Integer> odd=Predicate.not(even); //new feature  java11

        List<Integer>evenNumbers=list.stream()
                //.filter(even)
                .filter(Predicate.not(even))//Predicate.not()
                .collect(Collectors.toList());
    }
}
