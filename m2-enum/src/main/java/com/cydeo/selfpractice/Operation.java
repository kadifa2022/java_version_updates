package com.cydeo.selfpractice;

public enum Operation {

    PLUS, MINUS,MULTIPLY,DIVIDE;

    Operation(){
        System.out.println("Constructor");//Call constructor will print 4 x because each constant is object of operation(constructor can't be public)
    }

}
