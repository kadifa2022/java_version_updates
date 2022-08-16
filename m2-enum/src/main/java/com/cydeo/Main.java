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

        Currency[] currencies = Currency.values();  // value and override toString

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

        System.out.println("Operation Task");
        calculate(3,5, Operation.PLUS);

        System.out.println("how to retrieve constant value");
        System.out.println(Currency.PENNY.getValue()); // call object though enum class
        System.out.println(Currency.QUARTER.getValue());
        System.out.println(Currency.QUARTER.ordinal());// ordinal()is for INDEX

    }

    private static void calculate(double x, double y, Operation operation){

        switch (operation){
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
