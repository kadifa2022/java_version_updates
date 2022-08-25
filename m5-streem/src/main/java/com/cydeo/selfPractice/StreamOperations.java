package com.cydeo.selfPractice;

import java.util.Arrays;
import java.util.List;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.forEach(System.out::println);

        System.out.println("----------Filter---------------");

        //filter()
        list.stream()
                .filter(i -> i%2==0)
                .forEach(System.out::println);

    }
}
