package com.cydeo.Practice;

import java.util.function.Consumer;

public class ConsumerPractice {

    public static void main(String[] args) {
                             //n is variable that represent argument
                             // takes one parameter and doesn't return any value
        Consumer<int[]>printEach= n-> {
            for (int each : n) {
                System.out.println(each);
            }
        };
        int [] numbers= {100,200,300,400};
        printEach.accept(numbers);//methode accept


        }

    }

