package com.cydeo.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing; // to import static method

public class AppleTest {

    public static void main(String[] args) {


        List<Apple> inventory = new ArrayList<>();


        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100, Color.RED));
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(150, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));

        Comparator<Apple> sortApple= comparing((Apple apple)-> apple.getWeight());
        inventory.sort(sortApple);

        System.out.println(inventory);

        // importing static method // instead of calling through class name
        //Comparator <Apple> sortApple2  = comparing (Apple::getWeight);// class name and method
        inventory.sort(comparing (Apple::getWeight)); // simplify with ::
        System.out.println(inventory);
        // Reversed
        inventory.sort(comparing (Apple::getWeight).reversed()); // descending order
        System.out.println(inventory);

        // Channing methods
        inventory
                .sort(comparing(Apple::getWeight)
                .reversed().thenComparing(Apple::getColor));



    }

}
