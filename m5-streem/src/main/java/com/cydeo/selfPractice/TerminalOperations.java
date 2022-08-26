package com.cydeo.selfPractice;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Optional;

public class TerminalOperations {

    public static void main(String[] args) {



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








        }





    }
}
