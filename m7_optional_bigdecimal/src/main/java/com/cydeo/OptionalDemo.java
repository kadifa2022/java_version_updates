package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(2, 4, 2, 6, 10, 25);


        //empty() is Present()//protecting of null pointer exception
        Optional<String> empty = Optional.empty();
        //System.out.println(empty);
        //System.out.println(empty.isEmpty());

        //value
       // Optional.of(number).isPresent();//return boolean
       // System.out.println(Optional.of(number).isPresent());

        // ifPresent
        Optional<Integer> bigNumber = number.stream().filter(x -> x > 100).findAny();
        bigNumber.ifPresent(System.out::println);

        //get
       // System.out.println(bigNumber.get());

       // orElse
        System.out.println(bigNumber.orElse(5));


    }
}