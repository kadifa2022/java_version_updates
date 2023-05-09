package com.cydeo.streamPratice;

import com.cydeo.streamPratice.dishTask.Dish;
import com.cydeo.streamPratice.dishTask.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(3,4,5,6,7);

//        int sum =0;
//        for (int number : numbers) {
//            sum = sum + number;
//
//        }
        int result = numbers.stream().reduce(0,(a,b)->a+b);// same as line 11-13
        System.out.println(result);

        Optional<Integer> result2 = numbers.stream().reduce((a, b)-> a+b);
        System.out.println(result2);

        System.out.println("Dish calories total");// reduce() return optional .get()

       Optional<Integer> calTotal =DishData.getAll().stream()
                .map(Dish::getCalories)
               .reduce(Integer::sum);
        System.out.println(calTotal.get());//with optional, we use get() to return object
               // .reduce((a,b) ->a+b)


       //Max and Min and sum all return Optional //
        Optional<Integer> min= numbers.stream().reduce(Integer:: min);
        Optional<Integer> max= numbers.stream().reduce(Integer:: max);
        Optional<Integer> sum= numbers.stream().reduce(Integer:: sum);

        System.out.println("Min:" + min.get());
        System.out.println("Max:" + max.get());
        System.out.println("Sum:" + sum.get());


        // count()
        System.out.println("----------------------Count() ----------------------------");
        long dishCount = DishData.getAll().stream().count();
        System.out.println(dishCount);
    }



}
