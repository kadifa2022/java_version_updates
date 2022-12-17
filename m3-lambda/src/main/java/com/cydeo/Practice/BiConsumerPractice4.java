package com.cydeo.Practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class BiConsumerPractice4 {

    public static void main(String[] args) {


        Map<String, Integer> map= new LinkedHashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("D", 40);
        map.put("E", 50);

        map.forEach((k,v)-> {
           // System.out.println(k +" : " +y);

            if(v >=30){
                System.out.println(k);
            }
        });
    }


}
