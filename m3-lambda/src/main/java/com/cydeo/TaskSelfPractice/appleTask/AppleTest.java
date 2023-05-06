package com.cydeo.TaskSelfPractice.appleTask;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {

    public static void main(String[] args) {

        //apple object
        List<Apple> inventory = new ArrayList<>();

        inventory.add(new Apple(300,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(140,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(130,Color.GREEN));


        List<Apple> heavyApple= filterApples(inventory, new AppleHeavyPredicate());// looking for new  object
        System.out.println(heavyApple);
        List <Apple> greenApple= filterApples(inventory, new AppleGreenColorPredicate());
        System.out.println(greenApple);
                                   //TypeInference
        ApplePredicate weightApple= (Apple apple)->apple.getWeight()>200;
        filterApples(inventory, weightApple);



    }




    // Strategy   Design Patter for application
    //1. CREATE INTERFACE(abstract methode) 2. CREATE CLASSES TO IMPLEMENT INTERFACE
    //3. create method to (accept a bunch of behaviors) filter all apples and using applePredicate Interface(for different behavior)Polymorphism
    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate){// to accept different behaviors GREEN/HEAVY>200
        List<Apple> result = new ArrayList<>();// empty bucket for my returning


        for (Apple apple : inventory) {// checking each apple
            if(applePredicate.testApple(apple)){
                result.add(apple);
            }
        }

        return result;
    }

}
