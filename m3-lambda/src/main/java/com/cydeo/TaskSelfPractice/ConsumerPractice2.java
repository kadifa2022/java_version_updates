package com.cydeo.TaskSelfPractice;

import java.util.function.Consumer;

public class ConsumerPractice2 {

    public static void main(String[] args) {


        Consumer<int[]> printEach = n -> {
            for (int each: n) {
                System.out.println(each);
                
            }
        };
        int [] numbers ={100,200,300,400};
        printEach.accept(numbers);


    }
}
