package com.cydeo.TaskSelfPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePractice2 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();//removing objects from collection type-List-Queue-Set

        list.addAll(Arrays.asList(1,1,1,1,1,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,6,7,7,7,7,8,9,8));

      //  Predicate<Integer> isEven= p -> p % 2 == 0 ;


        list.removeIf(p-> p % 2 == 0);
        System.out.println(list);


    }

}
