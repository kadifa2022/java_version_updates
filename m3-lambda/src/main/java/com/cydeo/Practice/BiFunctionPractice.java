package com.cydeo.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionPractice {

    public static void main(String[] args) {// takes 2 arguments and returns value

        BiFunction<int[], int [], List<Integer>> merge = (a,b)->{
            List<Integer> list= new ArrayList<>();
            for (int each : a) {
                list.add(each);
            }
            for (int each : b) {
                list.add(each);
            }
            return list;
        };
        int [] arr1={1,2,3,4,5,6,7};
        int [] arr2={6,7,8,9,10,30};

        List<Integer> numbers= merge.apply(arr1,arr2);

        System.out.println(numbers);


    }
}
