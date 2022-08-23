package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {


    public static void main(String[] args) {

        System.out.println("ALL MATCH");
        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories() < 1000);//check for all date-must much with your condition-navigate methode (boolean isHealthy)
        System.out.println(isHealthy);

        System.out.println("ANY MATCH");

        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian)) {//if statement
            System.out.println("The menu is vegetarian friendly");
        }
        System.out.println("NONE MATCH");
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories() >= 1000);
        System.out.println(isHealthy2);

        System.out.println("FIND ANY");//to  prevent null exceptional they come up with Optional
        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish.get());

        System.out.println("FIND FIRST");
        Optional<Dish> dish2 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish2.get());

        //PARALLEL STREAM (Async)

        System.out.println(IntStream.range(0, 100).parallel().findAny());
        System.out.println(IntStream.range(0, 100).parallel().findFirst());

        List<String> list1 = Arrays.asList("Johny", "David", "Jack", "Duke", "Jill", "Danny", "Julia", "Jenish", "Divya");
        List<String> list2 = Arrays.asList("Johny", "David", "Jack", "Duke", "Jill", "Danny", "Julia", "Jenish", "Divya");

        // Async parallel
        //  Optional<String> findFirst=list1.parallelStream().filter(s -> s.startsWith("D")).findFirst(); //with parallel methode
        //  Optional<String> findAny=list2.parallelStream().filter(s -> s.startsWith("J")).findAny();//with parallel methode

        Optional<String> findFirst = list1.stream().filter(s -> s.startsWith("D")).findFirst();//with stream
        Optional<String> findAny = list2.stream().filter(s -> s.startsWith("J")).findAny();//with stream


        System.out.println(findFirst.get());
        System.out.println(findAny.get());

        //MIN AND MAX
        System.out.println("Minimum");
        Optional<Dish> dMin = DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println(dMin.get());

        System.out.println("Maximum");
        Optional<Dish> dMax = DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(dMax.get());


    }

}
