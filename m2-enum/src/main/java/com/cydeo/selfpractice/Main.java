package com.cydeo.selfpractice;

import java.util.concurrent.Callable;

import static com.cydeo.selfpractice.CurrencyDemo.PENNY;

public class Main {

     public static void main(String[] args) {


        System.out.println("How to access a constant ");

        Currency c = Currency.DIME;//already overridden - value()
        System.out.println(c);
        System.out.println(Currency.NICKLE);

        //how to get all constants
        System.out.println("How to get all constants");

        Currency[] currencies= Currency.values();


        for(Currency currency: currencies){
            System.out.println(currency);

        }
         System.out.println("How to use switch case with enums");
        Currency myCurrency=Currency.DIME;
        switch(myCurrency.PENNY){
             case PENNY:
                 System.out.println("It is 1 penny");
                 break;
            case DIME:
                System.out.println("It is 10 penny");
                break;case NICKLE:
                System.out.println("It is 5 penny");
                break;case QUARTER:
                System.out.println("It is 25 penny");
                break;



         }



    }
}
