package com.cydeo.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsumerInterface2 {
    public static void main(String[] args) {


        List<String> names= new ArrayList<>();
        names.addAll(Arrays.asList("Max,", "Josh", "Tina", "James", "Hailey", "Muhtar", "Ahmet"));
        names.forEach((p)->{
            if(p.startsWith("J")){
                System.out.println(p);
            }
        });
    }
}
