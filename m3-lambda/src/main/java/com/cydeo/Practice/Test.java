package com.cydeo.Practice;

public class Test {

    public static void main(String[] args) {
        //if is only one parameter no need ()

        MyInterface <Integer>cube = (x) -> System.out.println(x * x * x);       //if is only one statement no need for  {} braces

        cube.function(10);

        //as long this methode work with Integer and don't return any value than we can continue to use this methode

        MyInterface<Integer> oddOrEven = (a) -> {
            if (a % 2 == 0) {
                System.out.println(a + " is even number");
            } else {
                System.out.println(a + " is odd number");
            }
        };
        oddOrEven.function(100);

        MyInterface<String> reverse=(str)->{
            for (int i = str.length()-1; i >=0 ; i--) {
                System.out.print(str.charAt(i));
            }
            System.out.println();
        };

        reverse.function("Wooden Spoon");
    }



}