package com.cydeo.Practice;

import java.util.function.BiConsumer;

public class BiConsumerPractice3 {

    public static void main(String[] args){

        BiConsumer<String, Integer> printMultipleTimes= (s, n)->{
            for (int i = 0; i < n; i++) {
                System.out.println(s);
                
            }
        };
       printMultipleTimes.accept("Wooden Spoon", 5);


        
    }
}
