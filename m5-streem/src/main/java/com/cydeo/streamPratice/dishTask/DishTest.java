package com.cydeo.streamPratice.dishTask;

import java.util.Comparator;

import static java.util.Comparator.comparing;

public class DishTest {

    public static void main(String[] args) {

         //Print all dish's name that has less than 400 calories
        DishData.getAll().stream()
                .filter(dish->dish.getCalories()<400)
               // .map(dish -> dish.getName())
                .map(Dish ::getName)
                .forEach(System.out::println);

        System.out.println("-----------------length--------------");



        // print the length of the name of each dish
        DishData.getAll()// collection
                .stream()// stream
                .map(Dish::getName )
               // .map(dish->dish.length()) can be done this way
                .map(String::length)
                .forEach(System.out::println);
        System.out.println("----------limit-------------------");

        // print tree high caloric dish name (>300)
        DishData.getAll()
                .stream()
                .filter(dish -> dish.getCalories()>300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("----------Sorted in reversed way-------------------");

        // print all dish name that are below 400 calories is sorted
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .sorted(comparing(Dish::getCalories).reversed())// Imported static method comparing
                .map(Dish::getName)
                .forEach(System.out::println);


    }
}
