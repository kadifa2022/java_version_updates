package com.cydeo.java11;

public class StringMethodeDemo {

    public static void main(String[] args) {

        var str="Mike \n Ozzy \n Tom \n Emmy";
        str.lines().forEach(System.out::println); //intermediate operator

    }
}
