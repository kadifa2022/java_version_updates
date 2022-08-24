package com.cydeo.selfpractice;

import com.cydeo.Operation;

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

         System.out.println("Operation Task");
        calculate(3,5, Operation.PLUS);

         System.out.println("How to retrieve constant value");

         System.out.println(Currency.PENNY.getValue());//we are calling methode -ENUMS NAME . object(PENNY).getValue methode
         System.out.println(Currency.NICKLE.getValue());
         System.out.println(Currency.QUARTER.getValue());
         System.out.println(Currency.DIME.getValue());

         System.out.println(Currency.DIME.ordinal()); //index 0 //value based on index like Array
         System.out.println(Currency.NICKLE.ordinal());// index 1
         System.out.println(Currency.QUARTER.ordinal());//index 2
         System.out.println(Currency.PENNY.ordinal());// index 3


     }

     private static void calculate(double x, double y , Operation operation){//enum operation
         switch(operation){
             case PLUS:
                 System.out.println(x+y);
                 break;
             case MINUS:
                 System.out.println(x-y);
                 break;
             case MULTIPLY:
                 System.out.println(x*y);
                 break;
             case DIVIDE:
                 System.out.println(x/y);
                 break;
         }
     }


}
