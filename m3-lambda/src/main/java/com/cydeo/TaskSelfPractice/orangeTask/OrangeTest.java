package com.cydeo.TaskSelfPractice.orangeTask;

import com.cydeo.Apple;


import java.util.ArrayList;
import java.util.List;

public class OrangeTest {

    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<Orange>();

        inventory.add(new Orange(250, Color.GREEN));
        inventory.add(new Orange(300, Color.RED));
        inventory.add(new Orange(400, Color.GREEN));
        inventory.add(new Orange(100, Color.RED));


        OrangeFormatter orangeLambda= orange -> "An orange of " + orange.getWeight() + " g";// solution 1
        prettyPrintOrange(inventory, orangeLambda);

        prettyPrintOrange(inventory, orange ->  "An orange of " + orange.getWeight() + " g");//soution 2 same as above

        System.out.println("-------------------------------------------------------------");

        OrangeFormatter fancyFormatter = orange -> {
            String ch = orange.getWeight()>200? "Heavy" : "Light";
            return  "A " + ch + " " + orange.getColor() + " orange"; };

        prettyPrintOrange(inventory, fancyFormatter);


    }

    private static void prettyPrintOrange(List<Orange> inventory, OrangeFormatter formatter) {
        for (Orange orange : inventory) {
            String output = formatter.accept(orange);//returning type of the methode (String) formatter(func. Interface) accept()is abstract method
            System.out.println(output);


        }

    }
}