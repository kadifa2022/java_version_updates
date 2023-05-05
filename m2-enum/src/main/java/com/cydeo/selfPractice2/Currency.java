package com.cydeo.selfPractice2;

public enum Currency {
    // PENNY,NICKLE, DIME, QUARTER are Constants of Currency class

    PENNY(1) ,NICKLE(5), DIME(10), QUARTER(25);// to assign value to constants
    //initial value and create constructor



   private  int value;

    public int getValue() {// getter
        return value;
    }

    Currency(int value) {
        this.value = value;
    }
//can create variable
// constructor


}
