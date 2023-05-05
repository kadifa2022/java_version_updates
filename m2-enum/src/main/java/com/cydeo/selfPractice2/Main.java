package com.cydeo.selfPractice2;



public class Main {

    public static void main(String[] args) {
        System.out.println("How to access a constant");//accessing enum constants Through class

        Apple apple = new Apple(20);


        Currency c = Currency.DIME;

        System.out.println(c);
        System.out.println(Currency.PENNY);

      Currency [] currencies = Currency.values(); //get all constants->values() no new key word

        for (Currency currency : currencies) {

        }

        System.out.println("How to use switch - case with enums");
        Currency myCurrency = Currency.QUARTER;

        switch (myCurrency){
            case PENNY:
                System.out.println("It is 1 cent");
                break;
            case NICKLE:
                System.out.println("It is 5 cent");
                break;
            case DIME:
                System.out.println("It is 10 cent");
                break;

            case QUARTER:
                System.out.println("It is 25 cent");
                break;
        }
        System.out.println("------------------Operation task---------------");

        calculate(3,5,Operation.PLUS);



//        Apple a = new Apple(); // we need override toString() otherwise / will print hashCod
//        System.out.println(a); /e
    }
    private static void calculate(double x, double y, Operation operation){

        switch (operation){
            case PLUS:
                System.out.println(x+y);
                break;
            case MINUS:
                System.out.println(x-y);
                break;
            case MULTIPLE:
                System.out.println(x*y);
                break;
            case DIVIDE:
                System.out.println(x/y);
                break;
        }

    }

}
