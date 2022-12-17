package com.cydeo.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionalPractice2 {

    public static void main(String[] args) {

        Function<int[],List<Integer>> arrayTolIst= array->{
            List<Integer> list= new ArrayList<>();
            for (int each: array) {
                list.add(each);

            }
            return list;
        };

        int[]arr= {1,2,3,4,5};
        List<Integer> list= arrayTolIst.apply(arr);

        System.out.println(list);

    }
}
