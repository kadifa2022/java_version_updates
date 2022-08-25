package com.cydeo.selfPractice;

import lombok.ToString;

import java.util.Arrays;
import java.util.List;

public class DishData {

    public static List<Dish> getAll(){

        return Arrays.asList(
                new Dish("Pasta", false,300,Type.OTHER),
                new Dish("Tomato", true, 100,Type.OTHER),
                new Dish("Steak",false,700,Type.MEAT),
                new Dish("Pasta", false,400, Type.OTHER),
                new Dish("Meat", false,800,Type.MEAT),
                new Dish("Sardine", false, 450, Type.FISH),
                new Dish("Salmon", false,500,Type.FISH),
                new Dish("Fries", false,600,Type.OTHER)
        );

    }


}
