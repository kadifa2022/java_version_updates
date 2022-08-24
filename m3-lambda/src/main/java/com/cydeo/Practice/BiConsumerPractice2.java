package com.cydeo.Practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class BiConsumerPractice2 {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("D", 40);

        map.forEach(  (k,y)-> {//forEach()
            if(y>=30) {
                System.out.println(k);
                //System.out.println(k + ":" + y);
            }
        });


    }
}
