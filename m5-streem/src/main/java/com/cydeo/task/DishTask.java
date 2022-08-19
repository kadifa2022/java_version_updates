package com.cydeo.task;


import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

public class DishTask {

    public static void main(String[] args) {

        //print all dish's name that is less than 400 calories

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() < 400)
                //.map(dish -> dish.getName())
                .map(Dish::getName)
                .forEach(System.out::println);


        //print the length of the name of each dish//map for each

        DishData.getAll().stream()
                .map(Dish::getName)
            //    .map(dish->dish.length())
                .map(String :: length)
                .forEach(System.out::println);


        //Print three high caloric dish name (>300)
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()>300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);


        //Print all dish name that are below 400 calories in sorted
                 DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .sorted(comparing(Dish ::getCalories).reversed()) //sorted ()
                .map(Dish::getName)
                .forEach(System.out::println);








        }


        }


