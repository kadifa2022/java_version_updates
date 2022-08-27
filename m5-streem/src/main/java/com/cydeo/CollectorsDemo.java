package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;
import com.cydeo.task.Type;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(3,4,5,6,6,7);

        //toCollection(Supplier): is used to create a collection using Collector
        List<Integer>numberList = numbers.stream()
                .filter(x-> x%2 ==0)
                .collect(Collectors.toCollection(ArrayList::new));//return new Arraylist-constructor

        System.out.println(numberList);

        Set<Integer> numberSet=numbers.stream()
                .filter(x->x%2 ==0)
                .collect(Collectors.toCollection(HashSet::new));//hashSet doesn't allow duplicates
        System.out.println(numberSet);

        //toList() : returns a collector interface that getters the input data into a new list
        //we will use this structure in future
        List<Integer> numberList2 =numbers.stream()
                .filter(x-> x%2==0)
                .collect(Collectors.toList());

        //toSet() : returns a collector interface that getters the input into a new set
        Set<Integer> numberSet2 =numbers.stream()
                 .filter(x-> x%2==0)
                .collect(Collectors.toSet());

        //toMap(Function, Function) : returns Collector interface that gathers input data into a new map-functional interface
       Map<String,Integer>dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));
        System.out.println(dishMap);

        //summingInt(ToIntFunction) : returns a Collector that produces the sum of Integer-valued function
        //stream is with java 8 and that is advantage of java
        Integer sum =DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);

        //counting(): returns a Collector that counts the number of elements
        Long evenCount=numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.counting());
        System.out.println(evenCount);

        //averagingInt(ToIntFunction) : returns average of the Integers pass values

        Double calorieAverage = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));

        System.out.println(calorieAverage);

        //joining(): is used to join various elements of a character or string array  into a single objects
        List<String> courses = Arrays.asList("Java", "JS","TS");
        String str = courses.stream()
                .collect(Collectors.joining(","));
        System.out.println(str);
        //partitioningBy() : is used to partition a stream of objects (or set of elements) based on given predicate)

        Map<Boolean,List<Dish>>veggieDish=DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(veggieDish);

        //groupingBy() : is used for grouping objects by some property and storing results in a Map Instance

        Map<Type,List<Dish>>dishType=DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishType);

        //joining(): is used to join various elements of a character array into a single object

        List<String> course= Arrays.asList("Java", "JS", "TS");
        String  names = course.stream()
                .collect(Collectors.joining());
        System.out.println(names);//combining

        //partitioningBy(): is used to partition  a stream of objects (or set of elements) based on given predicate

        Map<Boolean,List<Dish>> veggieDish2=DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));

        System.out.println(veggieDish2);
        //GroupingBy(): is used for grouping objects by some property and storing results into a map instance

        Map<Type,List<Dish>> dishType2=DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));















    }
}
