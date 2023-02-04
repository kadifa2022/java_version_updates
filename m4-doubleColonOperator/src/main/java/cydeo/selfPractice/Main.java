package cydeo.selfPractice;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

            //  Predicate<Integer> pred =(p) -> p %2==0? true:false;
        //interface   //implementation
       Calculate sum = (x,y)-> System.out.println( x + y);

       //interface  // two parameters//class calculator and abstract methode

        Calculate s1= (x,y)->Calculator.findSum(x,y);//with lambda

        //reference through static methode // created in class calculator
        //interface    class      static methode-from class calculator

        Calculate s2 = Calculator::findSum; //static methode //with double colon operator

        s2.calculate(10,20);

        //Reference through instant methode

        Calculator obj= new Calculator();//create object
        Calculate s3 = obj::findMultiply;//call through object directly

        Calculate s4 = new Calculator():: findMultiply;//instance methode

        // interface  accepting two parameters one return type
        //ready interface  // we can use DOUBLE COLON OPERATOR when lambda expression referencing to methode-

        BiFunction<String,Integer,String> func = (str, i) -> str.substring(i);//implementation is coming from methode
        BiFunction<String,Integer,String> func2 = String::substring;//call this methode directly (because of str.substring()

        Function<Integer, Double> b = new MyClass()::methode;//(new MyClass()-defining object) want to call methode that I created
         //BiFunction Interface is accepting MyClass and no need to call Through methode
        BiFunction<MyClass, Integer, Double> b1= MyClass::methode;

        Consumer<Integer> display= i-> System.out.println(i);
        Consumer<Integer> display2=  System.out::println;






    }
}
