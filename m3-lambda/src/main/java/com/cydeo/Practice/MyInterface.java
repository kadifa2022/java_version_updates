package com.cydeo.Practice;
@FunctionalInterface
public interface MyInterface <T>{//if we specify generics <T>Type we can use for any object Type non-primitive


    //can not be more than one abstract methode
    void function(T a);       // intends of (int) we are using T generics type to work with any object
                               // one abstract methode we can use for different functions



}
