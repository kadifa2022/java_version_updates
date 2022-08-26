package com.cydeo.selfPractice;

import jdk.swing.interop.SwingInterOpUtils;

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

        }





    }
}
