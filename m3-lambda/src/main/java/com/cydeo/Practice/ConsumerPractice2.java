package com.cydeo.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsumerPractice2 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Max", "Josh", "Breanna", "Hailey", "James", "Ahmed", "Muhtar", "Shay"));
        //forEach()-collection iterable method-every time we pass forEach()- Consumer functional Interface
        // p is representing  each element

        names.forEach((p) -> {            //this lambda is implementation  of abstract methode
            if (p.startsWith("J")) {        //additional condition

                System.out.println(p);

            }
        });

    }
}