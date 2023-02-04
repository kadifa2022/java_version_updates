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

        //implementation lambda -Interface  accepting orange and returning string
        OrangeFormatter orangeLambda= orange-> "An orange of " + orange.getWeight() + "g";

        //call methode
        prettyPrintApple(inventory,orangeLambda);

        //second solution passing action directly -same output  as Orange Formatter
        prettyPrintApple(inventory,orange-> "An orange of " + orange.getWeight() + "g");

        System.out.println("****************************************************");

        //passing curly bracket if is  more than one statement/line
        OrangeFormatter fancyFormatter = orange -> {

            String ch = orange.getWeight()>200 ? "Heavy" : "Light";
            return "A " + ch + " " + orange.getColor() + " orange";

        };
        prettyPrintApple(inventory,fancyFormatter);

    }

    //task
    //convert to ready functional interface
    OrangeFormatter prettyPrintApple = orange -> orange.getColor().name();

                                //methode List<>inventory and interface
        private static void prettyPrintApple(List<Orange> inventory, OrangeFormatter formatter){//interface
            for (Orange orange:inventory) {
                String output = formatter.accept(orange);
                System.out.println(output);
                
            }
        }

}
