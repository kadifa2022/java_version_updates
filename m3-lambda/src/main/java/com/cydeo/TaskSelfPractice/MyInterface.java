package com.cydeo.TaskSelfPractice;
@FunctionalInterface

public interface MyInterface<T> {//if want to use this methode for different date type we need to add generics<T>

    //public modifier and abstract methode are given by default

    //void function(int a);//abstract methode (only one abstract methode)parameter to work with integer

    void function(T a); // generic can be applied to Class, interface and methode
}
