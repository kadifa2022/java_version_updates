package cydeo.practice2;

import cydeo.Practice.Calculate;

import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {// double collen operation implementation with methods
        //Predicate<Integer> pred = (p)->p%2==0 ? true : false;}

        Calculate sum = (x,y)-> System.out.println(x+y);
        Calculate s1 = (x,y)-> Calculator.findSum(x,y);//calling  ready method from calculator class
            // Reference to static method
        Calculate s2= Calculator::findSum;//calling static method from calculator class using :: operator
        s2.calculate(10,20);

        // Reference to a instance methode
        Calculator obj= new Calculator();// first create object for instance method
        Calculate s3 = obj::findMultiply;//object is calling method directly

        // another way for instance method
        Calculate s4 = new Calculator()::findMultiply;

        BiFunction<String, Integer, String> func= (str, i)->str.substring(i);
        BiFunction<String, Integer, String > func2 = String::substring;

        Function<Integer, Double> b = new MyClass()::method;
        BiFunction<MyClass, Integer, Double > b1 = MyClass::method;

        Consumer<Integer> display = i-> System.out.println(i);
        Consumer<Integer> display2 = System.out::println;

        // Functional programing, lambda , double collen operator, stream


            }

    }

