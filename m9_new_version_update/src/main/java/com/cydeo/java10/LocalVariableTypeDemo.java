package com.cydeo.java10;

import java.util.Arrays;

public class LocalVariableTypeDemo {

    public static void main(String[] args) {

        var str="Cydeo";
        var number = 5;

        byte x=1;
        var y =1;//int

        var price=12.50;
        var numbers = Arrays.asList(1,2,3,4);//local variable

        var sum= 0;
        for(var eachNumbers:numbers){
            sum=sum + eachNumbers;
        }



    }
}
