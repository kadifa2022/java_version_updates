package com.cydeo.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePractice2 {

    public static void main(String[] args) {//collection can be List, Queue, Set

        List<Integer>list = new ArrayList<>();
            //to remove objects from collection type
            //collection has remove if methode
        list.addAll(Arrays.asList(1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,5,6,6,6,6,6,7,7,7,7,8,8,8,9,9,9));


        //fist solution
        Predicate<Integer> isEven= p-> {
            if(p % 2 == 0){
                return true;
            }else{
                return false;
            }
        };
        //second solution simplify
        Predicate<Integer> isEven2 = p->p %2 ==0;

        list.removeIf(isEven);

        System.out.println(list);


    }
}
