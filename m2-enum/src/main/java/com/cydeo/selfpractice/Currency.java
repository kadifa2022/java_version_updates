package com.cydeo.selfpractice;



public enum Currency {//(penny, nickle , dime, quarter) -is the object of currency class

     PENNY(1),NICKLE(5),DIME(10),QUARTER(25);   // create constant value with UPPER LETTER
      //value can be assign
     int value;  //private variable

     Currency(int value) {//assigning variable --trough constructor and then assign value to constant
          this.value = value;
     }

     public int getValue() { //methode -
          return value;
     }
}
/*
    enums class:
    Enum in Java is a data type that contains FIX SET OF CONSTANTS.
    CONSTANT VALUE (OBJECTS)ARE CREATED with UPPER LETTERS
     Enum is static and FINAL.
    Enum may implement many interfaces, but can't extents any class, because Internally
    extends Enum class (java.long.Enum)
    Enum can  have fields, constructors, methods
    purpose of constructor is to initiate the value,
    constructor can't be public.

 */