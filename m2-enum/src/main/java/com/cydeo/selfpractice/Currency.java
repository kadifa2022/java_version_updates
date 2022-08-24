package com.cydeo.selfpractice;

//enum is  static, final

public enum Currency {//(penny, nickle , dime, quarter) -is the object of currency class

     PENNY(1),NICKLE(5),DIME(10),QUARTER(25);   //constant value

     int value;

     Currency(int value) {//assigning variable --trough constructor and then assign value to constant
          this.value = value;
     }

     public int getValue() { //methode -
          return value;
     }
}
/*
    enums class has constructor, to string

 */