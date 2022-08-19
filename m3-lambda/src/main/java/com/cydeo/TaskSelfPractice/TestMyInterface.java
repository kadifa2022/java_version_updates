package com.cydeo.TaskSelfPractice;

public class TestMyInterface {

    public static void main(String[] args) {

        // use abstract methode and implementation can give by using lambda expression

                       //if is only one parameter we don't need parentis- if is no parameter and more than one then is mandatory



            //this is lambda expression and if is only one statement in {} we don"t need {}--only more than one statement
                   //reference name  --implementation
        MyInterface<Integer> cube = x-> System.out.println(x * x * x);// by applying <T> GENERICS to interface, we have to specified date type when calling methode in test class
        cube.function(10);

        MyInterface<Integer> oddOrEven = (a)-> {// can't be primitive data-must be object -array
            if (a % 2 == 0){
                System.out.println(a + " is even number");
            }else{
                System.out.println(a + " is odd number");
            }
        };
        oddOrEven.function(100);



        MyInterface<String> reverse = (str) -> {
            for (int i = str.length()-1; i >= 0; i--) {
                System.out.print(str.charAt(i));
            }
            System.out.println();
        };
        reverse.function("Wooden Spoon");



    }

}
