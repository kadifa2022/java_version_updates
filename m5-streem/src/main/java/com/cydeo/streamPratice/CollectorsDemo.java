package com.cydeo.streamPratice;

import com.cydeo.streamPratice.dishTask.Dish;
import com.cydeo.streamPratice.dishTask.DishData;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7,7,8,88);

        // toCollection(Supplier) : is used to create a Collection using Collector
        List<Integer> numberList = numbers.stream()
                .filter(x->x%2 ==0)
                .collect(Collectors.toCollection(ArrayList::new));// Collector /all static methods inside class

        System.out.println(numberList);

        Set<Integer> numberSet= numbers.stream()
                .filter(x-> x%2==0)
                .collect(Collectors.toCollection(HashSet::new));//hash set does not accept duplicates
        System.out.println(numberSet);



        // toList(): returns ba Collector interface that gathers the in put data into a new list
        List<Integer> numberList2 = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toList());


       // toSet(): returns a Collector interface that gathers the input data into a new set
        Set<Integer> numberSet2 = numbers.stream()
                .filter(x->x%2 ==0)
                .collect(Collectors.toSet());


        // toMap() (Function, Function): returns a Collector interface that gathers the input data into a new map
        Map<String, Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));
        System.out.println(dishMap);

        //summingInt(ToIntFunction) : returns a Collector that produces the sum of a Integer_valued func
        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);

        //counting(): returns a Collector that counts the number of the elements
        Long evenCount = numbers.stream()
                .filter(x->x%2 ==0)
                .collect(Collectors.counting());

        System.out.println(evenCount);
        //averagingInt(ToIntFunction) : returns the average of the integers passed values
        Double calorieAverage = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(calorieAverage);

        // joining(): is used to join various elements of character  or string Array into a single object
        List<String> courses = Arrays.asList("Java", "JS", "TS");
       String str = courses.stream()
                .collect(Collectors.joining(","));
        System.out.println(str);


    }
}
