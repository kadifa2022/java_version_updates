package com.cydeo;

import jdk.swing.interop.SwingInterOpUtils;

public enum Operation {

    PLUS,MINUS,MULTIPLY,DIVIDE;  //each constant is the object  operation


    Operation() {                  //constructor can't be public
        System.out.println("Constructor");    //constructor execute for each operation one constructor
    }

}
