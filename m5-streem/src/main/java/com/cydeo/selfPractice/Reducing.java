package com.cydeo.selfPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(4,5,7,8,8);
       /*
       int sum=0;

        for(int number :numbers){
          sum=sum+number;
            }
            */
           int result=numbers.stream().reduce(0,(a,b)->a+b);

    System.out.println(result);

        System.out.println("-----------Dish Calories Total---------");

        Optional<Integer> calTotal=DishData.getAll().stream()
                .map(Dish::getCalories)
                .reduce((a,b) ->(a+b));
                                                  //getClass from Class
        System.out.println(calTotal.get());        //.get() with Optional

        // MIN AND MAX METHODE

        Optional<Integer> min=numbers.stream().reduce(Integer::min);
        Optional<Integer> max =numbers.stream().reduce(Integer::max);
        Optional<Integer> sum=numbers.stream().reduce(Integer::sum);

        System.out.println("Min "+ min.get());
        System.out.println("Max "+ max.get());
        System.out.println("Sum "+ sum.get());

        System.out.println("---------------Count--------------");

        long dishCount= DishData.getAll().stream().count();
        System.out.println(dishCount);








    }
}
