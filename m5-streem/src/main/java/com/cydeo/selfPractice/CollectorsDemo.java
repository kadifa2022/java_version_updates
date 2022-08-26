package com.cydeo.selfPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9);
        //toCollection(Supplier): is used to Create Collection using Collector

        List<Integer>numberList=numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toCollection(ArrayList::new));//calling constructor with new

        System.out.println(numberList);




    }
}
