package cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

      //  Predicate<Integer> pred = (p)-> p % 2 == 0? true:false;
                        //implementation
            Calculate sum= (x,y)-> System.out.println(x+y);//long way how to do

            Calculate s1 =(x,y)->Calculator.findSum(x,y);

            //reference to static methode
            // if your methode is static you can write just class name :: and methode
            Calculate s2=Calculator::findSum;
            s2.calculate(10,20);

            // reference to instants methode -create object
        Calculator obj = new Calculator();

            Calculate s3= obj::findMultiply;

            Calculate s4 = new Calculator() :: findMultiply;
        // TWO PARAMETER ONE RETURN TYPE          //str is object name
        BiFunction<String, Integer,String> func= (str, i)->str.substring(i);

        //implementation is coming from methode          //substring is not static methode
        BiFunction<String, Integer,String> func2= String ::substring;

        Function<Integer,Double> b = new MyClass()::method;
        BiFunction<MyClass,Integer,Double> b1=MyClass::method;




    }
}