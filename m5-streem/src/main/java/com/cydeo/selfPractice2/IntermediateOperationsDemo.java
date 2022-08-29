package com.cydeo.selfPractice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperationsDemo {

    public static void main(String[] args) {

        //distinct(): returns the distinct elements in the stream after eliminating the duplicates

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,1,1,2,2,2,3,3,3,4,4,4,5,5,6,6,6,7));

        list1=list1.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);

        //Limit(n): returns the elements in stream after skipping the first elements
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,1,1,2,2,2,3,3,3,4,4,4,5,5,6,6,6,7));

        list2=list2.stream().skip(5).collect(Collectors.toList());
        System.out.println(list2);

        //limit(n): returns first (n) elements in the stream

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,1,1,2,2,2,3,3,3,4,4,4,5,5,6,6,6,7));

        list3=list3.stream().limit(5).collect(Collectors.toList());
        System.out.println(list3);
    }

}
