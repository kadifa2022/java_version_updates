package com.cydeo.selfPractice;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(1,2,3,4,4,5,6,6,7,8,8,9);
        //toCollection(Supplier): is used to Create Collection using Collector

        List<Integer>numberList=numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toCollection(ArrayList::new));//calling constructor with new

        System.out.println(numberList);

        Set<Integer> numberSet=numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toCollection(HashSet::new));//HashSet does not support duplicates
        System.out.println(numberSet);

        //toList(): returns a Collector Interface that gathers the input data to a new list

        List<Integer> numbersList2 =numbers.stream()//in application structure we will use this example
                      .filter(x-> x%2==0)
                      .collect(Collectors.toList());

        System.out.println(numbersList2);

           //toSet(): returns a collector interface that gathers  the input date to a new set

        Set<Integer>numbersSet2=numbers.stream()
                   .filter(x-> x%2==0)
                   .collect(Collectors.toSet());

        System.out.println(numbersSet2);

        //toMap(Function:Function): returns a Collector Interface that gathers input data into a new map

        Map<String,Integer>dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));
        System.out.println(dishMap);










    }
}
