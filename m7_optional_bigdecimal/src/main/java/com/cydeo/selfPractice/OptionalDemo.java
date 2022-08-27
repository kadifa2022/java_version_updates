package com.cydeo.selfPractice;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(2,4,2,10,23);
        //empty() ifPresent()
        Optional<String> empty = Optional.empty();
        System.out.println(empty);
        System.out.println(empty.isPresent());

        System.out.println(Optional.of(number).isPresent());
        System.out.println(empty.get());

        //ifPresent
        Optional<Integer>bigNumber=number.stream().filter(x-> x >100).findAny();
        bigNumber.ifPresent(System.out::println);
        //get()
        System.out.println(bigNumber.get());

        //OrElse
        System.out.println(bigNumber.orElse(5));




    }

}
