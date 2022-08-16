package com.cydeo;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {


        System.out.println("How to access a constant");

         //class name = className.objectName
        Currency c = Currency.DIME;
        System.out.println(c);         //(c is pointing to object (DIME))
        System.out.println(Currency.PENNY);

        System.out.println("How to access all constants at the same time");

        Currency[] currencies = Currency.values();  // value and overriden toString

        for(Currency currency: currencies){
            System.out.println(currency);
        }

        System.out.println("How to use switch-case with enum");

        switch (Currency.PENNY){
            case PENNY:
                System.out.println("It is 1 cent");
                break;
            case DIME:
                System.out.println("It is 10 cent");
                break;
            case NICKLE:
                System.out.println("It is 5 cent");
                break;
            case QUARTER:
                System.out.println("It is 25 cent");
                break;


        }


    }
}
