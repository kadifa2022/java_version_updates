package com.cydeo.TaskSelfPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsumerPractice {

    public static void main(String[] args) {

        List<String> names= new ArrayList<>();//consumer for collection and any collection type (forEach loop)

        names.addAll(Arrays.asList("Max", "Josh","BreAnna", "Hailey", "James","Ahmet","Muhtar","Shay"));

        names.forEach((p) -> {
                    if (p.startsWith("J")) {
                        System.out.println(p);
                    }
                    });


    }
}
