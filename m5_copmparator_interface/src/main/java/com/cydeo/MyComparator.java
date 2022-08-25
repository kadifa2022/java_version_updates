package com.cydeo;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> { //Comparator functional Interface

    @Override    // methode
    public int compare(Integer o1, Integer o2) {
        return (o1>o2)?-1:(o1 <o2) ? 1:0;

    }
}
