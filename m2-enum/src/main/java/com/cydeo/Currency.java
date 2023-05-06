package com.cydeo;

public enum Currency {

    //Enum  je special type of the class only holding CONSTANTS object  (STATIC -FINAL) and writing with UPPER LETTER
    // how to reed-PENNY, NICKLE, DIME, QUARTER is an Object of Currency class

    PENNY(1), NICKLE(5), DIME(10), QUARTER(25);// index 0,1,2,3

     private int value;

    Currency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
