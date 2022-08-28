package com.cydeo.java14;


public record User(String name, String address) {//this is my constructor

    public User { // no argument constructor

    }


    //this class is immutable and private,final
    //has allArg constructors
    //has getter  //no setter
    //to String
    //Equals
    //HASH CODE
    //DON'T HAVE GETTER


}
