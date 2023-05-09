package com.cydeo.streamPratice;

import com.cydeo.streamPratice.dishTask.Dish;
import com.cydeo.streamPratice.dishTask.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import static java.util.Comparator.comparing;

public class FindingMatching {

    public static void main(String[] args) {

        System.out.println("-------------AllMatch() return boolean and accepting predicate------------------");
     //return boolean
     boolean isHealthy= DishData.getAll().stream().allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealthy);

        System.out.println("---------AnyMatch() return boolean and accepting predicate-----------");
        if(DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The manu is vegetarian friendly");
        }

        System.out.println("------NonMatch() -- boolean and take predicate-------------");

        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish->dish.getCalories()>=1000);
        System.out.println(isHealthy2);

        System.out.println("--------FindAny() return type Optional and .get() to return object-----");
      //Optional = to prevent NullPointerException
       Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish.get());

        System.out.println("--------FindFirst() return type Optional and .get() to return object-----");
        //Optional = to prevent NullPointerException
        Optional<Dish> dish2 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish2.get());

        System.out.println("----------------Parallel streams (Async) -------------------");
        System.out.println(IntStream.range(0,100).parallel().findAny());
        System.out.println(IntStream.range(0,100).parallel().findFirst());

        List<String> list1= Arrays.asList("Jonny", "Mike", "tina ", "Duke", "Jill", "Dina ");
        List<String> list2= Arrays.asList("Jonny", "Mike", "tina ", "Duke", "Jill", "Dina ");
//        // Async ->
//        Optional<String> findFirst = list1.parallelStream().filter(s->s.startsWith("D")).findFirst();
//        Optional<String> findAny = list2.parallelStream().filter(s->s.startsWith("J")).findAny();
//        System.out.println(findFirst.get());
//        System.out.println(findAny.get());


        Optional<String> findFirst = list1.stream().filter(s->s.startsWith("D")).findFirst();
        Optional<String> findAny = list2.stream().filter(s->s.startsWith("J")).findAny();
        System.out.println(findFirst.get());
        System.out.println(findAny.get());


        System.out.println("----------------MIN and MAX is working with sorted() -------------------");
        //MIN nad imported static comparator
        Optional<Dish> dMin = DishData.getAll().stream().min(comparing(Dish::getCalories));
        System.out.println(dMin.get());
        //MAX
        Optional<Dish> dMax = DishData.getAll().stream().max(comparing(Dish::getCalories));
        System.out.println(dMax.get());














    }



}
