package com.cydeo;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,30,40,50);
        System.out.println(list);

        //Ascending order//java provide us interface comparator

        Collections.sort(list);
        System.out.println(list);

        //descending  order
        Collections.sort(list, new MyComparator());
        System.out.println(list);

        Collections.sort(list,((o1,o2)->(o1>o2)?-1:(o1 <o2) ? 1:0));






    }
}
