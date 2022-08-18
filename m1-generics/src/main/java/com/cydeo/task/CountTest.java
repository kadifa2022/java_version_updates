package main.java.com.cydeo.task;

import java.util.Arrays;
import java.util.List;

public class CountTest {

    public static void main(String[] args) {

        List<Integer> ci = Arrays.asList(1,2,3,4);
        int count = countIf(ci, new OddPredicate());
        System.out.println("Number of odd integers= " + count );


    }
    // Why we need generic? for countIf()-  we need methode to accept all numbers

    private static <T> int countIf(List<T> c, UnaryPredicate<T>p){ //interface for all options

        int count = 0;
        for(T elem :c){
            if(p.test(elem)){
                ++count;
            }
        }
        return count;

    }

}
