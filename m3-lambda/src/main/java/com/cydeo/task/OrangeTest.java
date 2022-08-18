package com.cydeo.task;

import com.cydeo.Apple;
import com.cydeo.Color;
import com.cydeo.task.Orange;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {


    public static void main(String[] args) {
        List<Orange> inventory = new ArrayList<Orange>();

        inventory.add(new Orange(250, Color.GREEN));
        inventory.add(new Orange(300, Color.RED));
        inventory.add(new Orange(400, Color.GREEN));
        inventory.add(new Orange(100, Color.RED));

        //implementation lambda
        OrangeFormatter orangeLambda= orange-> "An orange of " + orange.getWeight() + "g";

        //call methode
        prettyPrintApple(inventory,orangeLambda);

        //second solution passing action directly
        prettyPrintApple(inventory,orange-> "An orange of " + orange.getWeight() + "g");

        System.out.println("****************************************************");

        //passing curly bracket it's will be more than one statement/line
        OrangeFormatter fancyFormatter = orange -> {

            String ch = orange.getWeight()>200 ? "Heavy" : "Light";
            return "A " + ch + " " + orange.getColor() + " orange";

        };
        prettyPrintApple(inventory,fancyFormatter);

    }
        private static void prettyPrintApple(List<Orange> inventory, OrangeFormatter formatter){
            for (Orange orange:inventory) {
                String output = formatter.accept(orange);
                System.out.println(output);
                
            }
        }

}
