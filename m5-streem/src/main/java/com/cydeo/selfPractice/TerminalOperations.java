package com.cydeo.selfPractice;

import com.cydeo.FindingMatching;
import jdk.swing.interop.SwingInterOpUtils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class TerminalOperations {

    public static <Optiaonal> void main(String[] args) {



        System.out.println("ALL MATCH");

        boolean isHealthy=DishData.getAll().stream().allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealthy);

        System.out.println("ANY MATCH");

        if(DishData.getAll().stream().anyMatch(Dish::isVegetarian)){//getVegetarian
            System.out.println("The menu is vegetarian friendly ");

            System.out.println("NONE MATCH");

            boolean isHealthy2=DishData.getAll().stream().noneMatch(dish -> dish.getCalories()>=1000);
            System.out.println(isHealthy2);

            System.out.println("FIND ANY");//is going to the stream based on filtering condition
            Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
            System.out.println(dish.get());// return type is coming with Option// to prevent null exception

            System.out.println("FIND FIRST");
            Optional<Dish> dish2 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
            System.out.println(dish2.get());

            //Parallel Streams (Async)
            System.out.println(IntStream.range(0,100).parallel().findAny());
            System.out.println(IntStream.range(0,100).parallel().findFirst());

           // List<String> list1= Arrays.asList("Johny", "David","Jack","Duke","Jill","Danny","Julia","Jenissh","Divna");
           // List<String> list2= Arrays.asList("Johny", "David","Jack","Duke","Jill","Danny","Julia","Jenissh","Divna");

            List<String> list1= Arrays.asList("Johny", "David","Jack","Duke","Jill","Danny","Julia","Jenissh","Divna");
            List<String> list2= Arrays.asList("Johny", "David","Jack","Duke","Jill","Danny","Julia","Jenissh","Divna");

            Optional<String> findFirst=list1.stream().filter(s->s.startsWith("D")).findFirst();
            Optional<String>findAny=list2.stream().filter(s->s.startsWith("J")).findAny();

            System.out.println(findFirst.get());
            System.out.println(findAny.get());//Jill is picked (Acync) picked

            System.out.println( "------------MIN----------");//ACCEPTING Comparator

            Optional<Dish> dMin=DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
                //WITH OPTIONAL .get()
            System.out.println(dish.get());

            System.out.println("---------------MAX-----------------");//accepting Comparator

            Optional<Dish> dMax=DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));

            System.out.println(dMax);





        }





    }
}
