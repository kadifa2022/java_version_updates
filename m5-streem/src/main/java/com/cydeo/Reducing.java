package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;
import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {

        List<Integer>numbers= Arrays.asList(4,5,3,9);
        /*
        int sum = 0;
        for(int number : numbers){
            sum = sum + number;
        }

         */

        int result=numbers.stream().reduce(0,(a,b)-> a+b);
        Optional<Integer> result2= numbers.stream().reduce((a, b)->(a + b));// optional is protection of nullException
        System.out.println(result);
        System.out.println(result2);

        System.out.println("Dish calories total");//reduce is Putting Optional

        DishData.getAll().stream()
                .map(Dish::getCalories)
                .reduce((a,b)->(a+b))
                .getClass();


        System.out.println("Second solution ");
        //second option
        Optional<Integer>calTotal=DishData.getAll().stream()
                .map(Dish::getCalories)
       //         .reduce((a,b)->(a+b));
               .reduce(Integer::sum);

        System.out.println(calTotal.get());

        System.out.println("MAX and MIN");//MIN AND MAX METHODE

        Optional<Integer> min= numbers.stream().reduce(Integer::min);
        Optional<Integer> max=numbers.stream().reduce(Integer::max);
        Optional<Integer> sum=numbers.stream().reduce(Integer::sum);

        System.out.println("Min: " +min.get());
        System.out.println("Max: " +max.get());
        System.out.println("Sum: " +sum.get());

        //COUNT-HOW MANY DATA IN STREAM-RETURNING LONG
        System.out.println( "COUNT");

        long dishCount=DishData.getAll().stream().count();
        System.out.println(dishCount);

















    }
}
