package com.cydeo;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,30,40,50);
        System.out.println(list);

        //Ascending order//java provide us interface comparator

        Collections.sort(list);//comparator interface sort()
        System.out.println(list);

        //descending  order
        Collections.sort(list, new MyComparator()); //overloading sorting methode with two parameter
        System.out.println(list);

        Collections.sort(list,((o1,o2)->(o1>o2)?-1:(o1 <o2) ? 1:0));//we pas the action through lambda expression

        //ascending order
        list.sort((o1, o2) -> o1.compareTo(o2));//compareTo() lambda
        System.out.println(list);

        //de ascending
        list.sort((o2, o1) -> o1.compareTo(o2));
        System.out.println(list);





    }
}
