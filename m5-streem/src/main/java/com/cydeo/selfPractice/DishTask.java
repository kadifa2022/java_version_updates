package com.cydeo.selfPractice;

public class DishTask {

    public static void main(String[] args) {


        //print all dish's name that is less than 400 calories

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()>400)//predicate
                .map(Dish::getName)
                .forEach(System.out::println);//for all objects to print

        System.out.println("-------------------------------------");
        //print the length of the name of each dish//map for each

        DishData.getAll().stream()
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("-------------------------------------");

        //Print three high caloric dish name (>300)
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()>300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);



    }
}
