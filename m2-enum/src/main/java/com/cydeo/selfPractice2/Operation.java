package com.cydeo.selfPractice2;

public enum Operation {
    PLUS, MINUS, DIVIDE,MULTIPLE;// each constant is object( new ) of operation

    Operation() {// purpose of constructor: initial value
        System.out.println("Constructor");// constructor execute 4 times for each constant
    }
}
