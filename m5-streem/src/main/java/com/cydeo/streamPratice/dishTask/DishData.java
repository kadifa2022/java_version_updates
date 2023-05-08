package com.cydeo.streamPratice.dishTask;

import java.util.Arrays;
import java.util.List;

public class DishData {


    public static List<Dish> getAll() {
        return Arrays.asList(
                new Dish("pork", false, 800, Type.OTHER),
                new Dish("pork", false, 390, Type.MEAT),
                new Dish("beef", false, 700, Type.MEAT),
                new Dish("chicken", false, 300, Type.MEAT),
                new Dish("fries", true, 200, Type.OTHER),
                new Dish("pizza", false, 35, Type.OTHER),
                new Dish("salmon", false, 120, Type.FISH),
                new Dish("fruit", true, 100, Type.OTHER),
                new Dish("rice", true, 550, Type.OTHER));

    }
}