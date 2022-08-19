package com.cydeo;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {
        //intermediate  operation - returning stream

        List<Integer> list= Arrays.asList(1,2,3,4);//for Each methode
        list.forEach(System.out::println);//we can use for inter. operation


        System.out.println("---------------------filter-----------------------");


        list.stream()//filter is important
                .filter(i-> i % 2==0)
        .forEach(System.out::println); //for each return void


        System.out.println("---------------------District----------------");

        Stream<Integer> str = list.stream()
                .filter(i -> i % 2==0)
                .distinct();//for unique product based on your need
        str.forEach(System.out::println);

        System.out.println("---------------------Limit-----------------------");

        list.stream()
                .filter(i-> i %2 ==0)//
                .limit(1)
                .forEach(System.out::println);

        System.out.println("---------------------Skip-----------------------");

        list.stream()
                .filter(i-> i %2 ==0)
                .skip(1)
                .forEach(System.out::println);

        System.out.println("---------------------Map-----------------------");

        list.stream()
                .map(number->number *2)//map is important remember
                .filter(i-> i %3 ==0)
                .forEach(System.out::println);





    }
    }

