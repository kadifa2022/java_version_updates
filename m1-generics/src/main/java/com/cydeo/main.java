package main.java.com.cydeo;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        ArrayList <Integer>items = new ArrayList();//array list is accepting any object until -generics- we put angle bracket<integer>)//
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
       // items.add("apple"); error

        printDoubled(items);// created methode


    }

    private static void printDoubled(ArrayList <Integer>items) {//object is from collection
        for (Integer i:items) {
            System.out.println(i *2);

            
        }

        
    }
}
