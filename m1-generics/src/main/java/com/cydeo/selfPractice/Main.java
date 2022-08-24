package main.java.com.cydeo.selfPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {//until Java 5 wasn't protection--after java  < angle brackets>generics to protect class and interface

        ArrayList <Integer>items=new ArrayList<Integer>(); //<angle brackets>-generics
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
       // items.add("Apple");  //different data type -integer //

        printDoubled(items);

    }

    private static void printDoubled(ArrayList items){
        for (Object i: items) {
            System.out.println((Integer)i*2);//cast
            
        }
    }
}
