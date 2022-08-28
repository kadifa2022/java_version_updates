package com.cydeo.java10;

import java.util.Optional;

public class OrElseThrowDemo {

    public static void main(String[] args) {

        Optional<String>str=Optional.empty();

        System.out.println(str.get());

        //is combination of .get() and .isPresent() = .orElseThrow

        if(str.isPresent()){
            System.out.println(str.get());
        }else{
            //exception handling-come with java10
            System.out.println(str.orElseThrow()); //one solution
            System.out.println(str.orElseThrow(()->new RuntimeException()));//second solution
        }

    }
}
