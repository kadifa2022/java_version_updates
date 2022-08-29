package com.cydeo.selfPractice2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Imperative_vs_DeclarativeApproach {
    public static void main(String[] args) {
        List<Integer> numbers= new ArrayList<>();

        numbers.addAll(Arrays.asList(1,1,1,2,2,2,3,3,3,4,4,4,4,5,5,5));

        System.out.println("--------Imperative Approach---------------");
        List<Integer> result1 = new ArrayList<>();
        for (Integer each:numbers) {
            if(!result1.contains(each)){
                result1.add(each);
            }
        }

        System.out.println(result1);

        System.out.println("------------Declarative Approach---------------");

        List<Integer> result2= numbers.stream().distinct().collect(Collectors.toList());

        System.out.println(result2);


    }

}
