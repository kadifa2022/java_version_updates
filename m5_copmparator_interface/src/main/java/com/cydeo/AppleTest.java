package com.cydeo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory= new ArrayList<Apple>();

        inventory.add(new Apple(250,Color.GREEN));
        inventory.add(new Apple(300, Color.RED));
        inventory.add(new Apple(400, Color.GREEN));
        inventory.add(new Apple(100, Color.RED));
        //sort
        Comparator<Apple> sortApple= comparing((Apple apple)->apple.getWeight());
        inventory.sort(sortApple);
        System.out.println(inventory);

        inventory.sort(comparing(Apple::getWeight));
        System.out.println(inventory);

        System.out.println("------------------Reverse-----------------");

        inventory.sort(comparing(Apple::getWeight).reversed());
        System.out.println(inventory);
        System.out.println("-----------------Channing-------------------");

        inventory.sort(comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));


    }


}
