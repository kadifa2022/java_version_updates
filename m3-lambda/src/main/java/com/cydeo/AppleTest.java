package com.cydeo;

import jdk.swing.interop.SwingInterOpUtils;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory= new ArrayList<Apple>();

        inventory.add(new Apple(250,Color.GREEN));
        inventory.add(new Apple(300, Color.RED));
        inventory.add(new Apple(400, Color.GREEN));
        inventory.add(new Apple(100, Color.RED));

        List<Apple> heavyApple= filterApple(inventory, new AppleHeavyPredicate());
        System.out.println(heavyApple);

        List<Apple> greenApple= filterApple(inventory, new AppleGreenColorPredicate());
        System.out.println(greenApple);



        ApplePredicate weightApple= (Apple apple) -> apple.getWeight()>200;
        filterApple(inventory,weightApple);



    }
    //task
    //convert to ready functional interface

    private static List<Apple> filterApple(List<Apple> inventory, ApplePredicate applePredicate){

        List<Apple>  result = new ArrayList<>();

        for (Apple apple: inventory) {
            if(applePredicate.test(apple)){
               result.add(apple);
            }
        }
        return result;

    }


}
